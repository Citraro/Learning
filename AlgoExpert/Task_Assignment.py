def taskAssignment(k, tasks):
    pairedTasks = []
	
	taskDurationsToIndices = getTaskDurations(tasks)
	
	sortedTasks = sorted(tasks)
	
	for idx in range(k):
		task1Duration = sortedTasks[idx]
		indiciesWithTaskDuration = taskDurationsToIndices[task1Duration]
		task1Index = indiciesWithTaskDuration.pop()
		
		task2SortedIndex = len(tasks) - 1 - idx
		task2Duration = sortedTasks[task2SortedIndex]
		indiciesWithTaskDuration = taskDurationsToIndices[task2Duration]
		task2Index = indiciesWithTaskDuration.pop()
		
		pairedTasks.append([task1Index,task2Index])
	
	
    return pairedTasks


def getTaskDurations(tasks):
	taskDurationsToIndices = {}
	
	for idx, taskDuration in enumerate(tasks):
		if taskDuration in taskDurationsToIndices:
			taskDurationsToIndices[taskDuration].append(idx)
		else:
			taskDurationsToIndices[taskDuration] = [idx]
	return taskDurationsToIndices
		
