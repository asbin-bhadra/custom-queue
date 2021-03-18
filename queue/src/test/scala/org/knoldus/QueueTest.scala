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

import org.scalatest.flatspec.AnyFlatSpec

import java.util.NoSuchElementException

class QueueTest extends AnyFlatSpec{

  "enqueue" should "return list if object is created of tpe Integer" in {
    val queue = new Queue[Int]
    val list = List(1,2,5,7,8)
    val result = queue.enqueue(list,10)
    assert(result == List(1,2,5,7,8,10))
  }

  it should "return list if object is created of type String" in {
    val queue = new Queue[String]
    val list = List("a","b","c","d")
    val result = queue.enqueue(list,"e")
    assert(result == List("a","b","c","d","e"))
  }
  it should "return list with adding the element if list with one element provided" in {
    val queue = new Queue[String]
    val list = List("a")
    val result = queue.enqueue(list,"e")
    assert(result == List("a","e"))
  }

  it should "return list with adding the element if empty list provided" in {
    val queue = new Queue[String]
    val list = List()
    val result = queue.enqueue(list,"e")
    assert(result == List("e"))
  }

  "dequeue" should "return list with eliminating the first element of type Integer" in {
    val queue = new Queue[Int]
    val list = List(1,2,5,7,8)
    val result = queue.dequeue(list)
    assert(result == List(2,5,7,8))
  }

  it should "return list with eliminating the first element of type String" in {
    val queue = new Queue[String]
    val list = List("a","b","c","d")
    val result = queue.dequeue(list)
    assert(result == List("b","c","d"))
  }

  it should "throw NoSuchElementException if empty list provided" in {
    val queue = new Queue[Int]
    assertThrows[NoSuchElementException]{
      queue.dequeue(List())
    }
  }

  it should "return empty list if list with one element provided" in {
    val queue = new Queue[Int]
    val list = List(1)
    val result = queue.dequeue(list)
    assert(result == List())
  }

  "isEmpty" should "return true if empty list provided" in {
    val queue = new Queue[Int]
    val result = queue.isEmpty(List())
    assert(result)
  }

  it should "return false if non empty list provided" in {
    val queue = new Queue[Int]
    val list = List(1,2,3)
    val result = queue.isEmpty(list)
    assert(!result)
  }

  "peek" should "return element" in {
    val queue = new Queue[Int]
    val list = List(1,2,3)
    val result = queue.peek(list)
    assert(result == 1)
  }

  it should "return element if list with one element provided" in {
    val queue = new Queue[Int]
    val list = List(1)
    val result = queue.peek(list)
    assert(result == 1)
  }

  it should "throw NoSuchElement if list is empty" in {
    val queue = new Queue[Int]
    assertThrows[NoSuchElementException]{
      queue.peek(List())
    }
  }

}
