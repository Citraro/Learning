class Solution {
    public List<String> removeComments(String[] source) {
        boolean isComment = false;
        boolean isInLineComment = false;
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        
        for(String line : source){
            if(!isComment && sb.length() != 0){
                result.add(sb.toString());
                sb = new StringBuilder();
            }

            isInLineComment = false;
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == '/'){
                    if(i + 1 != line.length()){
                        if(line.charAt(i+1) == '/' && !isComment){
                            isInLineComment = true;
                        }else if(line.charAt(i+1) == '*'){
                            if(!isInLineComment && !isComment){
                                isComment = true;
                                i++;
                            }
                        }else if(!isInLineComment && !isComment){
                            sb.append(line.charAt(i));
                        }
                    } else if(!isInLineComment && !isComment){
                        sb.append(line.charAt(i));
                    }
                } else if(line.charAt(i) == '*' && isComment){
                    if(i + 1 != line.length()){
                        if(line.charAt(i+1) == '/'){
                            isComment = false;
                            i++;
                        }
                    }
                } else if(!isComment && !isInLineComment){
                    sb.append(line.charAt(i));
                }
            }
        }
        
        if(!isComment && sb.length() != 0){
                result.add(sb.toString());
                sb = new StringBuilder();
        }
        
        return result;
    }
}
