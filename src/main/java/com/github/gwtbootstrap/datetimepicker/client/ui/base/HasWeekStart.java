/*
 *  Copyright 2012 GWT-Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.datetimepicker.client.ui.base;

/**
 * Define a element that have a day of week to start.
 *
 * @author Carlos Alexandro Becker
 * @author Alain Penders
 * @since 2.1.1.0
 */
public interface HasWeekStart {

    /**
     * Define the first day of week in the datepicker.
     *
     * @param start: 0 is sunday, 6 is saturday, so you can set the 0..6 interval.
     */
    void setWeekStart(int start);
}
