## About
I have implemented functions of Queue in scala language with SBT.

## Features
1. enqueue(List(),1) - Adds an item to the queue.
1. dequeue(List(1,2,4,5)) - Remove an item from the queue
1. isEmpty(List()) - Check if Queue is empty or not.
1. peek(List(1,5,4,6,2) - Fetch the first element of the Queue.

## Compile Code
```
sbt compile
```

## Test Code
```
sbt test
```

## Generate scalastyle config file ( Already created in this project )
```
sbt scalastyleGenerateConfig
```

## Check scalastyle for code
```
sbt scalastyle