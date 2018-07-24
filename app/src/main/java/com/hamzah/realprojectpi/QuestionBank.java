package com.hamzah.realprojectpi;



public class QuestionBank {
    // array of questions
    private String textQuestions [] = {
            "1. Planet yang memilik ukuran paling besar adalah ?",
            "2. Planet yang letaknya paling jauh dari matahari adalah ?",
            "3. Pusat tata surya adalah ?",
            "4. Satelit yang diimiliki bumi adalah ?",
            "5. Planet yang paling dekat dengan matahari adalah ?",
            "6. Satu-satunya planet di tata surya yang dapat dihuni manusia adalah ?",
            "7. Bumi Mengeliling matahari selama ?",
            "8. Benda langit yang mempunyai garis edar antara lintasan mars dan jupiter adalah ?",
            "9. Komet yang akan terlihat di bumi setiap 75-76 tahun sekali adalah ?",
            "10.Kumpulan dari matahari,  planet dan benda langit lainnya disebut ?",
            "11.Benda langit yang mengeliling matahari adalah ?",
            "12.Planet yang tidak memiliki satelit adalah ",
            "13.Phobos dan Deimos adalah satelit yang dimiliki planet ?",
            "14.Cincin yang dimiliki saturnus terdiri dari ?",
            "15.Planet-planet yang berada di tata surya tidak bertabrakan karena ?",
            "16.Nama Mars diambil dari nama dewa perang dari ?",
            "17.Peredaran planet pada sumbunya disebut ?",
            "18.Bulan tidak termasuk bintang karena hanya memantulkan cahaya dari ?",
            "19.Planet yang terdekat dengan bumi yaitu ?",
            "20.Planet yang terdekat dengan matahari dan merupakan planet terkecil adalah ?",






    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"bumi", "jupiter", "saturnus", "mars"},
            {"bumi", "saturnus", "neptunus", "uranus"},
            {"bumi", "planet", "komet", "matahari"},
            {"Deimos", "bulan", "phobos", "venus"},
            {"merkurius", "saturnus", "neptunus", "bumi"},
            {"merkurius", "jupiter", "bumi", "mars"},
            {"365","400","366","355"},
            {"asteroid","pluto","komet","bumi"},
            {"komet encke","komet halley","komet hyakutake","komet ikeya seki"},
            {"galaksi","planet","tata surya","satelit"},
            {"asteroid","satelit","meteor","planet"},
            {"merkurius","bumi","venus","mars"},
            {"merkurius","saturnus","venus","mars"},
            {"debu halus, kerikil, dan butiran es","besi,perak,dan emas","es,debu kasar,dan alumunium","gas,perak,dan kerikil"},
            {"mempunyai berat sendiri-sendiri","mempunyai satelit sendiri-sendiri","mempunyai rotasi sendiri-sendiri","mempunyai orbit sendiri-sendiri"},
            {"indonesia","jepang","belanda","romawi"},
            {"revolusi","rotasi","edar","orbit"},
            {"matahari","bintang","bumi","planet"},
            {"merkurius","venus","mars","uranus"},
            {"merkurius","venus","mars","uranus"},










    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"jupiter", "neptunus", "matahari","bulan","merkurius","bumi","365","Asteroid","Komet Halley", "tata surya",
                                        "planet","venus","mars","debu halus, kerikil, dan butiran es", "mempunyai orbit sendiri-sendiri","romawi",
                                        "rotasi","matahari","venus","merkurius"};

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}