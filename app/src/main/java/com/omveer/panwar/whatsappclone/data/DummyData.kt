package com.omveer.panwar.whatsappclone.data

data class Chat(
    val id: Int,
    val name: String,
    val time: String,
    val date: String?,
    val lastMessage: String?,
    val imageUrl: String?
)

data class Call(
    val id: Int,
    val name: String,
    val date: String,
    val imageUrl: String,
    val isMissCall: Boolean,
    val isIncoming: Boolean,
)

data class Message(
    val message: String,
    val isPeer: Boolean
)

object DummyData {
    val listChat = listOf(
        Chat(
            id = 0,
            name = "Omveer Panwar",
            time = "18:46",
            date = "16 oct",
            lastMessage = "Bhai kya kr rha h tu",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/events/WhatsApp%20Image%202022-08-24%20at%204.05.24%20PM.jpeg"
        ),
        Chat(
            id = 1,
            name = "Raman Verma",
            time = "12:45",
            date = null,
            lastMessage = "Bhai padh le kal Paper h",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/events/WhatsApp%20Image%202022-09-27%20at%2020.38.42.jpeg"
        ),
        Chat(
            id = 2,
            name = "Piyush Yadav",
            time = "13:00",
            date = "16 oct",
            lastMessage = "Bhai kal fail ho jaunga mai kuch nhi padha",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/events/WhatsApp%20Image%202022-09-27%20at%2020.38.42%20%281%29.jpeg"
        ),
        Chat(
            id = 3,
            name = "Vanshit Gupta",
            time = "14:56",
            date = "16 oct",
            lastMessage = "Mai toh paper hi dene nhi aa rha ",
            imageUrl = "https://media-exp1.licdn.com/dms/image/D4D03AQFRk9alihEyjQ/profile-displayphoto-shrink_800_800/0/1646478227599?e=1671062400&v=beta&t=w4WYcuq6-OTGYtM0SbZzqff6QEa9IV-s1aMkgPFscBY"
        ),
        Chat(
            id = 4,
            name = "Deepanshi",
            time = "15:00",
            date = "16 oct",
            lastMessage = "Yeh le syllabus padh le",
            imageUrl = "https://randomuser.me/api/portraits/women/67.jpg"
        ),
        Chat(
            id = 5,
            name = "Sumit Raj Jha ",
            time = "16:32",
            date = "16 oct",
            lastMessage = "Bhai kal event hai sambhal lena",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/events/gpic.jpeg"
        ),
        Chat(
            id = 6,
            name = "Vatsal",
            time = "14:55",
            date = "16 oct",
            lastMessage = "Sir meet kab karni hai?",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/avatars/vatsal_jain_A3zlLMZ.jpg"
        ),
        Chat(
            id = 7,
            name = "Aman Bansal",
            time = "18:46",
            date = "16 oct",
            lastMessage = "Bhai layout ready hai",
            imageUrl = "https://media-exp1.licdn.com/dms/image/C4D03AQHdnFn0mL6JgA/profile-displayphoto-shrink_800_800/0/1653760232658?e=1671062400&v=beta&t=5IPh-JyE2cmAhr5SK274j8BbTt_phWCP4m-yPfbEKzQ"
        ),

    )

    val listCall = listOf(
        Call(
            id = 0,
            name = "Raman Verma",
            date = "16 oct 15:13",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/events/WhatsApp%20Image%202022-09-27%20at%2020.38.42.jpeg",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 1,
            name = "Piyush yadav",
            date = "16 oct 14:03",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/events/WhatsApp%20Image%202022-09-27%20at%2020.38.42%20%281%29.jpeg",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 2,
            name = "Sumit Raj Jha",
            date = "16 oct 16:13",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/events/gpic.jpeg",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 3,
            name = "Aman Bansal",
            date = "16 oct 12:13",
            imageUrl = "https://media-exp1.licdn.com/dms/image/C4D03AQHdnFn0mL6JgA/profile-displayphoto-shrink_800_800/0/1653760232658?e=1671062400&v=beta&t=5IPh-JyE2cmAhr5SK274j8BbTt_phWCP4m-yPfbEKzQ",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 4,
            name = "Vatsal",
            date = "16 oct 18:13",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/avatars/vatsal_jain_A3zlLMZ.jpg",
            isIncoming = true,
            isMissCall = false
        ),

    )

    val listMessage = listOf(
        Message("Hi bro, how are you ?", false),
        Message("Iam fine, how are you ?", true),
        Message("Iam fine too", false),
        Message("What do you do now ?", true),
        Message("Write a book, and doing my work", false),
        Message("Wow, its so good man", true),
        Message("Yeah", false),
    )
}