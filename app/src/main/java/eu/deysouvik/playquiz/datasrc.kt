package eu.deysouvik.playquiz


object datasrc{
    fun getdata():ArrayList<Question_structure> {
        val QuestionsList = ArrayList<Question_structure>()

        val q1 = Question_structure(
            1,
            "Which Company is this ?",
            R.drawable.ferrari,
            "Ferrari",
            "Porsche",
            "BMW",
            "Mazda",
            1
        )
        QuestionsList.add(q1)

        val q2 = Question_structure(
            1,
            "Which Company is this ?",
            R.drawable.tesla,
            "TATA",
            "Tetly",
            "Tesla",
            "Tencent",
            3
        )
        QuestionsList.add(q2)

        val q3 = Question_structure(
            1,
            "Which Company is this ?",
            R.drawable.starwalks,
            "Cafe Coffee Day",
            "Starbucks",
            "Nestle",
            "KFC",
            2
        )
        QuestionsList.add(q3)

        val q4 = Question_structure(
            1,
            "Which Company is this ?",
            R.drawable.macdonalds,
            "Mahindra",
            "Mercedes",
            "Mazda",
            "McDonald's",
            4
        )
        QuestionsList.add(q4)

        val q5 = Question_structure(
            1,
            "Which Company is this ?",
            R.drawable.volkawagen,
            "VolksWagen",
            "Porsche",
            "Lexus",
            "Nissan",
            1
        )
        QuestionsList.add(q5)
        val q6 = Question_structure(
            1,
            "Which state produces maximum soybean?",
            0,
            "Madhya Pradesh",
            "Uttar Pradesh",
            "Bihar",
            "Rajasthan",
            1
        )
        QuestionsList.add(q6)
        val q7 = Question_structure(
            1,
            "Which country operationalized world’s largest radio telescope?",
            0,
            "USA",
            "China",
            "Russia",
            "India",
            2
        )
        QuestionsList.add(q7)
        val q8 = Question_structure(
            1,
            "Which of the following is the capital of Arunachal Pradesh?",
            0,
            "Itanagar",
            "Dispur",
            "Imphal",
            "Panaji",
            1
        )
        QuestionsList.add(q8)
        val q9 = Question_structure(
            1,
            "Katerina Sakellaropoulou was elected the first woman President of",
            0,
            "Greece",
            "Spain",
            "Finland",
            "Netherland",
            1
        )
        QuestionsList.add(q9)
        val q10 = Question_structure(
            1,
            "Which one among the following radiations carries maximum energy?",
            0,
            "Ultraviolet rays",
            "Gamma rays",
            "X- rays",
            "Infra-red rays",
            2
        )
        QuestionsList.add(q10)
        val q11 = Question_structure(
            1,
            "What is India’s rank on EIU’s Global Democracy Index 2019?",
            0,
            "48th Rank",
            "50th Rank",
            "53rd Rank",
            "51st Rank",
            4
        )
        QuestionsList.add(q11)
        val q12 = Question_structure(
            1,
            "Which of the following states is not located in the North?",
            0,
            "Jharkhand",
            "Jammu and Kashmir",
            "Himachal Pradesh",
            "Haryana",
            1
        )
        QuestionsList.add(q12)
        val q13 = Question_structure(
            1,
            "India’s first satellite of 2020 GSAT-30 was successfully launched is a",
            0,
            "Remote Sensing Satellite",
            "Communication Satelite",
            "Spy Satellite",
            "Metrological Satellite",
            2
        )
        QuestionsList.add(q13)
        val q14 = Question_structure(
            1,
            "In which state is the main language Khasi?",
            0,
            "Mizoram",
            "Nagaland",
            "Meghalaya",
            "Tripura",
            3
        )
        QuestionsList.add(q14)
        val q15 = Question_structure(
            1,
            "Allocation for BharatNet programme for 2020-21 is",
            0,
            "10000 crore",
            "8000 crore",
            "6000 crore",
            "4000 crore",
            3
        )
        QuestionsList.add(q15)
        val q16 = Question_structure(
            1,
            "The head quarters of world trade organization is in",
            0,
            "Montreal",
            "Seattle",
            "Geneva",
            "the Hague",
            3
        )
        QuestionsList.add(q16)
        val q17 = Question_structure(
            1,
            "“TB Harega Desh Jeetega” campaign aims to end Tuberculosis by the year",
            0,
            "2025",
            "2030",
            "2035",
            "2040",
            1
        )
        QuestionsList.add(q17)
        val q18 = Question_structure(
            1,
            "Which is the largest coffee producing state of India?",
            0,
            "Kerala",
            "Tamil Nadu",
            "Karnataka",
            "Arunachal Pradesh",
            3
        )
        QuestionsList.add(q18)
        val q19 = Question_structure(
            1,
            "Agriculture credit target for the year 2020-21 has been set at",
            0,
            "15 lakh crore",
            "14 lakh crore",
            "13 lakh crore",
            "12 lakh crore",
            1
        )
        QuestionsList.add(q19)
        val q20 = Question_structure(
            1,
            "The 2014 football world cup is scheduled to be held in",
            0,
            "China",
            "Australia",
            "Japan",
            "Brazil",
            4
        )
        QuestionsList.add(q20)
        val q21 = Question_structure(
            1,
            "Nobel prize is awarded for which of the following disciplines:",
            0,
            "Literature, peace and economics",
            "Medicine or Physiology",
            "Chemistry and Physics",
            "All the above",
            4
        )
        QuestionsList.add(q21)
        val q22 = Question_structure(
            1,
            "Which state has the largest population?",
            0,
            "Uttar Pradesh",
            "Maharastra",
            "Bihar",
            "Andra Pradesh",
            1
        )
        QuestionsList.add(q22)
        val q23 = Question_structure(
            1,
            "The Second Indian Satellite launched from Soviet Union was",
            0,
            "Rohini",
            "Aryabhata",
            "Bhaskar–1",
            "Apsara",
            3
        )
        QuestionsList.add(q23)
        val q24 = Question_structure(
            1,
            "Entomology studies what?",
            0,
            "Behavior of human beings",
            "Insects",
            "The origin and history of technical and scientific terms",
            "The formation of rocks",
            2
        )
        QuestionsList.add(q24)
        val q25 = Question_structure(
            1,
            "The language spoken by the people by Pakistan is ?",
            0,
            "Hindi",
            "Palauan",
            "Sindhi",
            "Nauruan",
            3
        )
        QuestionsList.add(q25)
        val q26 = Question_structure(
            1,
            "Galileo was an astronomer who",
            0,
            "developed the telescope",
            "discovered four satellites of Jupiter",
            "discovered that the movement of pendulum produces a regular time measurement",
            "All the above.",
            2
        )
        QuestionsList.add(q26)
        val q27 = Question_structure(
            1,
            "The metal whose salts are sensitive to light is",
            0,
            "Silver",
            "Zinc",
            "Copper",
            " Gold",
            1
        )
        QuestionsList.add(q27)
        val q28 = Question_structure(
            1,
            "Who is the father of geometry?",
            0,
            "Aristotle",
            "Euclid",
            "Pythagoras",
            "Kepler",
            2
        )
        QuestionsList.add(q28)
        val q29 = Question_structure(
            1,
            "The World Largest desert is ?",
            0,
            "Thar",
            "Kalahari",
            "Sahara",
            "Sonoran",
            3
        )
        QuestionsList.add(q29)
        val q30 = Question_structure(
            1,
            "Indian player Jude Felix is popular for which sports?",
            0,
            "Volleyball",
            "Football",
            "Hockey",
            "Tennis",
            3
        )
        QuestionsList.add(q30)
        val q31 = Question_structure(
            1,
            "The instrument useful for measuring curvature of surface is",
            0,
            "Odometer",
            "Spherometer",
            "Tachometer",
            "Speedometer",
            2
        )
        QuestionsList.add(q31)
        val q32 = Question_structure(
            1,
            "Who is popularly called as the Iron Man of India?",
            0,
            "Subhash Chandra Bose",
            "Sardar Vallabhbhai Patel",
            "Jawaharlal Nehru",
            "Govind Ballabh Pant",
            2
        )
        QuestionsList.add(q32)
        val q33 = Question_structure(
            1,
            "Country that has the highest in Barley Production ?",
            0,
            "China",
            "India",
            "Russia",
            "France",
            3
        )
        QuestionsList.add(q33)
        val q34 = Question_structure(
            1,
            "Guru Gopi Krishna is popular for which form of Indian dance?",
            0,
            "Bharatanatyam",
            "Kuchipudi",
            "Kathak",
            "Manipuri",
            2
        )
        QuestionsList.add(q34)
        val q35 = Question_structure(
            1,
            "J.B.Dunlop is popular for which of the following inventions?",
            0,
            "Model airplanes",
            "Pneumatic rubber tire",
            "Rubber boot",
            "Automobile wheel rim",
            2
        )
        QuestionsList.add(q35)
        val q36 = Question_structure(
            1,
            "The brain fever which affects young children is",
            0,
            "Malaria",
            "Typhoid",
            "Encephalitis",
            "Pneumonia",
            3
        )
        QuestionsList.add(q36)
        val q37 = Question_structure(
            1,
            "Which of the following items was introduced by James Watt?",
            0,
            "Hot air balloon",
            "Steam boat",
            "Diving bell",
            "Rotary Steam Engine",
            4
        )
        QuestionsList.add(q37)
        val q38 = Question_structure(
            1,
            "Which of the following cash crops is not grown in Kerala?",
            0,
            "Spices",
            "Tobacco",
            "Rubber",
            "Coffee",
            2
        )
        QuestionsList.add(q38)
        val q39 = Question_structure(
            1,
            "In which field is the B.C. Roy Award given?",
            0,
            "Environment",
            "Journalism",
            "Medicine",
            "Music",
            3
        )
        QuestionsList.add(q39)
        val q40 = Question_structure(
            1,
            "The Central Rice Research Station is situated in ?",
            0,
            "Chennai",
            "Cuttack",
            "Bangalore",
            "Quilon",
            2
        )
        QuestionsList.add(q40)
        val q41 = Question_structure(
            1,
            "Which company is this?",
            R.drawable.nike,
            "Nike",
            "Puma",
            "Reebok",
            "Adidas",
            1
        )
        QuestionsList.add(q41)
        val q42 = Question_structure(
            1,
            "Which country is this?",
            R.drawable.china,
            "Iran",
            "Italy",
            "China",
            "Japan",
            3
        )
        QuestionsList.add(q42)
        val q43 = Question_structure(
            1,
            "Which company is this?",
            R.drawable.twitter,
            "Facebook",
            "Wechat",
            "Twitter",
            "Instagram",
            3
        )
        QuestionsList.add(q43)
        val q44 = Question_structure(
            1,
            "Which company is this?",
            R.drawable.spotify,
            "ganna",
            "Spotify",
            "Wink music",
            "Youtube",
            2
        )
        QuestionsList.add(q44)
        val q45 = Question_structure(
            1,
            "Which company is this?",
            R.drawable.honda,
            "Kawasaki",
            "Hero",
            "Hyundai",
            "Honda",
            4
        )
        QuestionsList.add(q45)











































        return QuestionsList
    }
}
