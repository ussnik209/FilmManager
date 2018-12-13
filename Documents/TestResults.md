# Test Results


| № | Title | Scenario | Expected Result | Actual result | Pass/Fail indication |
|:---|:---|:---|:---|:---|:---|
| 1 | Add movie to the aplication's library without entering path | Press "All movies" screen's button "Add movie", in the window that appeared press button "Ok" with empty field | Application alerts user to enter path | Error messege appears| Pass |
| 2 | Add movie to the aplication's library with wrong format path | Press "All movies" screen's button "Add movie", in the window that appeared press button "Ok" after entering wrong format path | Application alerts user about the wrong format of path | Application displays movie in list of all movies | Fail |
| 3 | Add movie to the aplication's library with correctly entered path| Press "All movies" screen's button "Add movie", in the window that appeared press button "Ok" after entering path | Application displays movie in list of all movies | The title of movie apears in list of all movies | Pass |
| 4 | Add movie to the list of desired | Press "Desired" screen's button "Add movie", press button "Ok" after chosing the film to add | Application displays movie in list of desired movies| Application doesn't respond to pressing "Add movie" button | Fail |
| 5 | Add movie to the list of viewed | Press button "Open" to run movie | Application displays movie in list of viewed | Application doesn't display movie in list of viewed | Fail |
| 6 | Add movie to the list of favorite | Press button "Like" near movie's title | Application displays movie in list of favorite | Application doesn't respond to pressing "Like" button | Fail |
| 7 | Create custom list | Press "Playlists" screen's button "Add list", in the window that appeared enter title of list and choose movies to add to list. Press button "Ok" | Application displays list in list of playlists | Application doesn't respond to pressing "Add list" button | Fail |
| 8 | Add movie to the custom list | Press "Playlist" screen's button "Add movie", in the window that appeared choose movie to add | Application displays movie in apropriated custom list | Application doesn't respond to pressing "Add movie" button | Fail |
| 9 | Run movie with title | Press "All movies" screen's button "Open" near field with title | Application opens new window with movie | Apears new window with running movie | Pass |
| 10 | Run movie without title | Press "All movies" screen's button "Open" near field without title | Application alerts user that movie is missing | Application doesn't respond to pressing "Open" button | Fail |
| 11 | Information about the film should be readable | Open "All movies" screen | Application displays "All movies" screen with lists of readable titles of movies | Titles of movies appear on "All movies" screen | Pass |
| 12 | The application must respond to any user action | Press all buttons on all screens | Application responds to any pressing | Many buttons don't respond to pressing | Fail | 
| 13 | The application works the same way with and without the Internet | Complete full testing with and without the Internet | The system works equally with and without the Internet | The actual result corresponds to the expected result | Pass |
| 14 | The application window can be full screen and partially | Сhange the size of window | Graphical user interface is correctly displayed | The actual result corresponds to the expected result | Pass |
| 15 | The application does not change the functionality after use | After testing, exit the application. Repeat these steps several times | The application does not change the functionality | The actual result corresponds to the expected result | Pass |
| 16 | The application may be deleted | Delete application from computer | The application is completely absent on the computer | The actual result corresponds to the expected result | Pass |

The total number of successfully passed tests: 8 out of 16

The application doesn't perform all its main functions. It necessary to implement missing functions.
