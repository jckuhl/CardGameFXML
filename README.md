# Card Game FXML

Card Game FXML is a Java framework for building card games in Java

# Installation

- Create a JavaFX project in IntelliJ
- Download the JavaFX SDK from [here](https://gluonhq.com/products/javafx/)
- Unzip to a desired location and then go to Project Settings -> Global Libraries and import the /lib folder
- Go to Run/Debug configurations and insert the following into the VM Options, where <PATH> is your path to where you unzipped the SDK

    --module-path ADD_YOUR_PATH/javafx-sdk-11/lib --add-modules=javafx.controls,javafx.fxml
    
- Run the file

StackOverflow has a simple guide, as well as steps for using Maven and a link to the official guide:

[Intellij can't recognize javafx 11 with OpenJDK 11](https://stackoverflow.com/questions/52467561/intellij-cant-recognize-javafx-11-with-openjdk-11#52470141)

The OpenJFX website also has instructions for Gradle, and for other IDEs such as Eclipse and Netbeans:

[JavaFX Starting Guide](https://openjfx.io/openjfx-docs/#introduction)