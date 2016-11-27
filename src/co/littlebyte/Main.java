/*
 * Copyright 2016 NiKoTron
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.littlebyte;

import co.littlebyte.collections.IntervalTree;

public class Main {

    public static void main(String[] args) {
        IntervalTree<Integer, String> tree = new IntervalTree<>();
        System.out.println(String.format("paste rock = %s", tree.put(10, 12, "rock")));
        System.out.println(String.format("paste metal = %s", tree.put(15, 20, "metal")));
        System.out.println(String.format("paste lol jazz = %s", tree.put(100, 102, "lol jazz")));
        System.out.println(String.format("paste lol 2jazz = %s", tree.put(4, 3, "lol 2jazz")));
        System.out.println(String.format("paste govnorock = %s", tree.put(-1, 2, "govnorock")));
        System.out.println(String.format("paste chasstuski = %s", tree.put(-23, -4, "chasstuski")));
        System.out.println(String.format("paste kinder metal = %s", tree.put(200, 210, "kinder metal")));

        System.out.println(String.format("result %s", tree.search(0)));
        System.out.println(String.format("result %s", tree.search(4)));
        System.out.println(String.format("result %s", tree.search(102)));
        System.out.println(String.format("result %s", tree.search(1022)));
    }
}
