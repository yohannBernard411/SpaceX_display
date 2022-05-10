# SpaceX display

![alt text](https://zupimages.net/up/22/19/uc6g.png "Screen")

Why this site?

  I wanted to learn Angular and Java, so I took a course on Udemy, but just viewing and reproducing isn't enough to learn so I needed a project, an API-based project that would deliver JSON-like information, and the API that I liked the most is SpaceX. In terms of operation: at each request, my Angular application asks my JAVA API which itself asks the space X API to provide the corresponding information. Of course it would be more efficient to ask the SpaceX API directly and to switch off Back-end! But the goal here for me is to learn. Then the collected information is displayed on the screen with the components of Angular Material. You can see the different equipment such as Capsules, Cores, Dragons, History, Info, Landing Pads, Launches, Launch Pads, Missions, Payloads, Rockets, Roadster, Ships.

This repository contains:

1. [The front end](https://github.com/yohannBernard411/spacex-display-app/tree/main/src/main/resources/static) who is build in angular with the command line "ng build --configuration production" on Visual Studio Code.
2. [The back end](https://github.com/yohannBernard411/spacex-display-app/tree/main/src/main/java/com/formation/capsule) who is create with Java on Eclipse IDE.

This Back-end cotains:

1. [Controllers](https://github.com/yohannBernard411/spacex-display-app/tree/main/src/main/java/com/formation/capsule/controllers).
2. [Dao](https://github.com/yohannBernard411/spacex-display-app/tree/main/src/main/java/com/formation/capsule/dao).
2. [Models](https://github.com/yohannBernard411/spacex-display-app/tree/main/src/main/java/com/formation/capsule/models).
2. [Services](https://github.com/yohannBernard411/spacex-display-app/tree/main/src/main/java/com/formation/capsule/services).


## Table of Contents

- [Components](#components)
- [Responsive](#responsive)
- [Source](#source)
- [Application](#application)

## Components

Most of the front end components come from [Material Angular](https://material.angular.io/).
The SpaceX api have full of image lists, and I needed a component to display them, that's why I chose [ngx-image-viewer](https://www.npmjs.com/package/ngx-image-viewer). But the API also contains links to youtube videos, and to display these videos and thus avoid going to Youtube, I chose: [Youtube-player](https://www.npmjs.com/package/@angular/youtube-player).

## Responsive

The responsive is simply managed by the size of the cards and by the display flex which goes from raw to column.

## Source

I created this site as an application exercise after having followed [Pierre Cailleaud's udemy course](https://www.udemy.com/course/votre-premiere-app-web-angular-springboot/), the application of which on car parks is visible [here](https://park-rochefort-app.herokuapp.com/parkings) and the code is [here](https://github.com/yohannBernard411/RochefortParkingApp). This site is therefore far from perfect. But it allowed me to discover **Java**, **Spring Boot**, annotations, **Angular**, components, and other...

## Application

You can test my Space X display application [here](https://spacexdisplayapp.herokuapp.com).