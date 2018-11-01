### Flow of events

![Flow of events](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/use%20case.png)

### 1. Actors

| Actors | Description |
|:--|:--|
| User | Person using the app |

### 2. Use cases
#### 2.1 Add film to application's library.
1. It's availible when user open "All movies" window.
2. Then user press on "Add movie" and enter path of the film.
3. The application checks if the file is alive. If there is no file along this path, then an alternate stream of A1 events is executed.
4. The application checks if the file extension has correct format. If the extension does not right, then an alternate A2 stream is executed.
5. The application adds a movie to your library.
#### 2.2 Add film to the list
1. It's avalible when user open "Movies list" window.
2. Then user press on "Add Film".
3. User choose film to add.
#### 2.3 Create list
1. It's avalible when user open "Movies list" window.
2. Then user should press on "Create list".
3. User will write name of list and choose films to add.
#### 2.4 Mark film as favorite
1. It's avalible when user choose film.
2. Then user press on "Like".
### 2.5 Play film
1. It's availible when user choose film.
2. Then user press on "Play".
