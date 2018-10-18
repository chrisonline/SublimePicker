# SublimePicker

A customizable view that provisions picking of a date, time & recurrence option, all from a single user-interface. You can also view 'SublimePicker' as a collection of material-styled (API 23) DatePicker, TimePicker & RecurrencePicker, backported to API 14.

With the release of version 2, SublimePicker now allows date-range selection.

All three components have been converted to views, which enables us to add/embed them anywhere - add them to a 'Dialog', a 'PopupWindow', or use them as any regular android widget. 

Almost all styling possibilities have been exposed through attrs. If something has been missed, please bring it to my attention.

SublimePicker provides a single point of entry to all three pickers. What I mean is that once SublimePicker is available for interaction, the user can select a date, a time & a recurrence option without leaving the picker.

Gradle dependency
-----------------

`compile 'com.colapps.sublimepickerlibrary:sublimepickerlibrary:2.1.5'`

ProGuard rule
-----------------
Not needed anymore is added in the library

Walkthrough
-----------
Following screenshots have been taken from the sample application: [<img alt="Get it on Google Play" height="45px" src="https://play.google.com/intl/en_us/badges/images/apps/en-play-badge-border.png" />][1]

Version 2 allows date-range selection using `SublimeOptions#setCanPickDateRange(boolean)`. Picking date range is _one fluent gesture_ which begins with a long-press on the intended start-date, followed by a drag onto the intended end-date. The range can span as many days, months or years, as needed. During a drag, approaching the left/right edge of date picker scrolls the previous/next month into view.  

<table><thead>
<tr>
<th align="center">Date Picker</th>
<th align="center">Date Range Selection</th>
<th align="center">Date Range Multiple Months</th>
</tr>
</thead><tbody>
<tr>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/date_picker_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/date_picker_v2.png?raw=true" alt="Launching into **DatePicker**" style="max-width:100%;"></a></td>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/date_picker_date_range_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/date_picker_date_range_v2.png?raw=true" alt="Monitor" style="max-width:100%;"></a></td>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/date_picker_date_range_spanned_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/date_picker_date_range_spanned_v2.png?raw=true" alt="Date range selection spanning multiple months" style="max-width:100%;"></a></td>
</tr>
<tr>
<td align="center"><em>Launching into DatePicker</em></td>
<td align="center"><em>Date Range Selection Mode</em></td>
<td align="center"><em>Date Range Selection Months</em></td>
</tr>
</tbody></table>

Button at bottom-left corner can be used to switch to TimePicker:

<table><thead>
<tr>
<th align="center">Time Picker</th>
<th align="center">Recurrence Picker</th>
</tr>
</thead><tbody>
<tr>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/time_picker_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/time_picker_v2.png?raw=true" alt="Swtich to TimePicker" style="max-width:100%;"></a></td>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/recurrence_picker_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/recurrence_picker_v2.png?raw=true" alt="The overflow button at top-right opens the RecurrencePicker" style="max-width:100%;"></a></td>
</tr>
<tr>
<td align="center"><em>The overflow button at top-right opens the RecurrencePicker</em></td>
<td align="center"><em>Quick Selection or Custom</em></td>
</tr>
</tbody></table>

<table><thead>
<tr>
<th align="center">RecurrencePicker</th>
<th align="center">Custom View</th>
<th align="center">Until Date - DatePicker</th>
</tr>
</thead><tbody>
<tr>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/recurrence_picker_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/recurrence_picker_v2.png?raw=true" alt="The overflow button at top-right opens the RecurrencePicker" style="max-width:100%;"></a></td>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/recurrence_option_creator_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/recurrence_option_creator_v2.png?raw=true" alt="Choosing Custom... from this menu brings you to **RecurrenceOptionCreator" style="max-width:100%;"></a></td>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/recurrence_option_creator_end_date_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/recurrence_option_creator_end_date_v2.png?raw=true" alt="Choosing Custom... from this menu brings you to **RecurrenceOptionCreator" style="max-width:100%;"></a></td>
</tr>
<tr>
<td align="center"><em>Quick Recurrence Options and Custom</em></td>
<td align="center"><em>Options including Forever, Count and Until Date</em></td>
<td align="center"><em>Until a date shows a stripped down version of DatePicker</em></td>
</tr>
</tbody></table>

<table><thead>
<tr>
<th align="center">Sample Application</th>
<th align="center">Results single date</th>
<th align="center">Results date range</th>
</tr>
</thead><tbody>
<tr>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/sampler_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/sampler_v2.png?raw=true" alt="Sample Application" style="max-width:100%;"></a></td>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/sampler_results_single_date_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/sampler_results_single_date_v2.png?raw=true" alt="Results of the selection in sample application (single date)" style="max-width:100%;"></a></td>
<td align="center"><a href="https://github.com/vikramkakkar/SublimePicker/blob/master/img/sampler_results_date_range_v2.png?raw=true" target="_blank"><img src="https://github.com/vikramkakkar/SublimePicker/blob/master/img/sampler_results_date_range_v2.png?raw=true" alt="Results of the selection in sample application (date range)" style="max-width:100%;"></a></td>
</tr>
<tr>
<td align="center"><em>View of the sample application</em></td>
<td align="center"><em>Results of the selection in sample application (single date)</em></td>
<td align="center"><em>Results of the selection in sample application (date range)</em></td>
</tr>
</tbody></table>

**How-to**s will be added in a day or two...

License
-------
    Copyright (c) 2015 Vikram Kakkar

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
	
	
	
[1]: https://play.google.com/store/apps/details?id=com.appeaser.sublimepicker
