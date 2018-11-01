### Flow of events

![Flow of events](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/use%20case.png)

### 1. Actors

| Actors | Description |
|:--|:--|
| User | Person using the app |

### 2. Use cases
#### 2.1 Add film to application's library.
##### Activity
![Activity](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Activity/Add%20film%20to%20application's%20library.png)
##### Secuence
![Secuence](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Secuence%20diagrams/Add%20film%20to%20application's%20library%20secuence%20diagram.png)

Description: The case "Add movie to application library" allows you to add a movie stored on the device to the application library.

The main flow of events:
1. It's availible when user open "All movies" window.
2. Then user press on "Add movie" and enter path of the film.
3. The application checks if the file is alive. If there is no file along this path, then an alternate stream of A1 events is executed.
4. The application checks if the file extension has correct format. If the extension does not right, then an alternate A2 stream is executed.
5. The application adds a movie to your library.

Alternate Event Flow A1:
1. Displays an error message asking you to enter a new path.
2. Go to step 2 of the main flow of events.

Alternate Flow A2:
1. Displays an error message.
2. Go to step 6 of the main flow of events.

#### 2.2 Add film to the list
##### Activity
![Activity](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Activity/Add%20film%20to%20the%20list.png)
##### Secuence
![Secuence](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Secuence%20diagrams/Add%20film%20to%20application's%20library%20secuence%20diagram.png)

Description: The case "Mark the movie as favorite" allows you to mark the movie as your favorite, for later access to it through the "Favorite" list.

The main flow of events:
1. It's avalible when user open "Movies list" window.
2. Then user press on "Add Film".
3. User choose film to add.
#### 2.3 Create list
##### Activity
![Activity](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Activity/Create%20list.png)
##### Secuence
![Secuence](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Secuence%20diagrams/Create%20list%20sequence%20diagam.png)

Description: The case "Create Playlist" allows you to create a new list of movies.

The main flow of events:
1. It's avalible when user open "Movies list" window.
2. Then user should press on "Create list".
3. User will write name of list and choose films to add.
#### 2.4 Mark film as favorite
##### Activity
![Activity](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Activity/Mark%20film%20as%20favorite.png)
##### Secuence
![Secuence](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Secuence%20diagrams/Mark%20film%20as%20favorite%20sequence%20diagram.png)

Description: The case "Add movie to list" allows you to add a movie from the application library to an already created playlist.

The main flow of events:
1. It's avalible when user choose film.
2. Then user press on "Like".
### 2.5 Play film
##### Activity
![Activity](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Activity/Play%20film.png)
##### Secuence
![Secuence](https://github.com/ussnik209/FilmManager/blob/master/Diagrams/Secuence%20diagrams/Play%20film%20secuence%20diagram.png)

Description: The case "Play movie" allows you to start playing the movie.

The main flow of events:
1. It's availible when user choose film.
2. Then user press on "Play".
