/* Copyright 2016 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package org.jberger.patterns.composite.composite;

import java.util.ArrayList;

public class Division implements Node {
    private ArrayList<Node> list;
    
    public Division() {
        list = new ArrayList<>();
    }

    @Override
    public String print() {
        String result = "<div>";
        for (Node each : list) {
            result += each.print();
        }
        result += "</div>";
        return result;
    }

    @Override
    public void add(Node child) {
        list.add(child);
    }

    @Override
    public void remove(Node child) {
        list.remove(child);
    }

    @Override
    public Node getChild(int index) {
        return list.get(index);
    }
}