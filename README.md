# Superhero Squad Recruitment App

The Superhero Squad Recruitment App is a Java Spark SQL-based application that allows users to recruit a well-balanced team of superheroes for various causes. Users can create and manage heroes, squads, and assign heroes to squads. The app also includes functionality to calculate scores for specific skill areas and has the potential for a turn-based battle system.

## Features

The Superhero Squad Recruitment App provides the following features:

- Create and manage heroes: Users can create heroes with a name, age, special power, and weakness. Heroes can be freely assigned or chosen from a pre-determined set of special powers and weaknesses.
- Create and manage squads: Users can create squads with a maximum size, name, and cause they are dedicated to fighting. Examples of causes include sexism, computer illiteracy, not covering your mouth when you sneeze, hogging bus seats with your backpack, passive-aggressive post-it notes, etc.
- Assign heroes to squads: Users can assign heroes to squads, ensuring that each hero can participate in only one squad at a time.
- Skill area scoring: The app allows calculating scores for specific skill areas such as defense, distance attacks, etc. Users can assess the overall strength and balance of their squads based on these scores.
- Turn-based battle system (optional): The app has the potential for integrating a turn-based battle system, where squads can engage in battles and showcase their abilities. Users can further extend the app to implement this feature.

## Installation

1. Clone the repository: `git clone https://github.com/zeuskeyz/JAVA-WK2-IP-HERO_SQUAD.git`
2. Navigate to the project directory: `cd superhero-squad-recruitment-app`
3. Install dependencies: `mvn install`
4. Run the application: `mvn exec:java`

## Technologies Used

The Superhero Squad Recruitment App is built using the following technologies:

- Java: The primary programming language for the application.
- PostgreSQL: A powerful, open source object-relational database system that uses and extends the SQL language combined with many features that safely store and scale the most complicated data workloads.
- Maven: A build automation tool for managing dependencies and building the application.
- Handlebars: A simple templating language. It uses a template and an input object to generate HTML or other text formats.
## Usage

1. Launch the application.
2. Access the app via a web browser at `http://localhost:4567`.
3. Use the provided user interface to create heroes, squads, and assign heroes to squads.
4. Calculate scores for specific skill areas to evaluate squad strength.

## Contributions

Contributions to the Superhero Squad Recruitment App are welcome! If you find any issues or have ideas for new features, please submit them via GitHub issues. Feel free to fork the repository and submit pull requests for enhancements or bug fixes.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT). You are free to use, modify, and distribute the code as per the terms of this license.

## Acknowledgments

This project was inspired by the love for superheroes and the desire to create a fun and engaging app. Thanks to the open-source community for providing valuable resources and libraries that made this project possible.
