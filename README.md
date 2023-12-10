# Проект "Дипломная работа №1" <br>Задание 1: юнит-тесты

## Описание проекта

Unit тесты с использованием фреймворка JUnit. <br>
Тесты написаны для проверки классов: 
* Ingredient
* Bun
* Burger
* IngredientType

## Требования перед запуском

1. Java 11
2. Maven
3. Jacoco

## Установка и запуск

1. Склонируй репозиторий:

   ```bash
   git clone https://github.com/Koloksay/QA-java-diplom-1
   
2. Перейди в каталог проекта:

   ```bash
   cd QA-java-diplom-1
   
3. Запуск тестов
  ```bash
    mvn clean test
  ```
4. Для просмотра отчётов.
   * в IDEA нажми Ctrl дважды
   * в окрывшемся окне выполни команду
```bash
    mvn clean verify
  ```
   * найди в папке `target/site/jacoco/` файл `index.html`
   * нажми на него правой кнопкой мыши 
   * выбери Open In — Browser — твой браузер

## Зависимости

* [JUnit](https://junit.org/junit4/) - фреймворк для написания тестов
* [Jacoco](https://www.jacoco.org/jacoco/trunk/doc/maven.html) - плагин для оценки покрытия кода

##### Автор: Катречко Александр<br>@kolo_ksay