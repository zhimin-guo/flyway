/*
 * Copyright © Red Gate Software Ltd 2010-2021
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core;

public class MainTest {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource("jdbc:dm://116.63.108.251:5237",
                "SYSDBA", "SYSDBA").load();
//        第一步先执行baseline,之后才能执行migrate
        flyway.baseline();
//        flyway.migrate();
        System.out.println("执行完了");

    }
}
