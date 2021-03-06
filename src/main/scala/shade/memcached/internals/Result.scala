/*
 * Copyright (c) 2012-2017 by its authors. Some rights reserved.
 * See the project homepage at: https://github.com/monix/shade
 *
 * Licensed under the MIT License (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy
 * of the License at:
 *
 * https://github.com/monix/shade/blob/master/LICENSE.txt
 */

package shade.memcached.internals

sealed trait Result[+T]
case class SuccessfulResult[+T](key: String, result: T, flags: Int) extends Result[T]
case class FailedResult(key: String, state: Status) extends Result[Nothing]
