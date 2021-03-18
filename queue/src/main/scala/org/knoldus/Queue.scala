// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.knoldus

class Queue[Any]{
  def enqueue(inputList:List[Any],value:Any):List[Any]={
    inputList ::: List(value)
  }

  def dequeue(inputList:List[Any]):List[Any]={
    inputList match {
      case Nil => throw new NoSuchElementException()

      case h :: Nil => List()

      case h :: tail => tail
    }
  }
  def isEmpty(inputList:List[Any]):Boolean={
    inputList match{
      case Nil => true

      case _ => false
    }
  }

  def peek(inputList:List[Any]):Any={

    inputList match{
      case head:: _ => head
      case Nil => throw new NoSuchElementException()
    }
  }
}
