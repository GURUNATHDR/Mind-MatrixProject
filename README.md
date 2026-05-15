🏅 Kreeda-Prerana Scout

Android App Development using GenAI – Sports Talent Identification System





















📌 Overview



Kreeda-Prerana Scout is an AI-assisted Android application designed to identify and track young sports talent in schools, especially in rural and underrepresented regions. The application works as a digital scouting platform where Physical Education teachers can register athletes, record their athletic performances, and monitor their improvement over time.



The system creates a structured digital history of athlete performance, helping coaches and talent scouts identify promising students who may have the potential to compete at district, state, or national levels.



The application supports performance tracking, leaderboards, milestone achievements, analytics visualization, and AI-assisted athlete insights.



🎯 Problem Statement



Talented athletes in rural schools often remain unnoticed due to the absence of a structured system for recording and analyzing sports performance data. Schools generally maintain manual records, which makes long-term performance tracking difficult.



Without historical data and digital analytics:



Coaches cannot accurately identify improving athletes.

Scouts miss potential talent from remote areas.

Students lack motivation through measurable achievements.

Schools cannot maintain organized athletic performance records.



Kreeda-Prerana Scout solves this problem by providing a centralized digital platform for athlete performance monitoring and talent identification.



🌟 Vision of the Project



The vision of Kreeda-Prerana Scout is to build a grassroots sports talent ecosystem that empowers schools to digitally monitor athletic growth and discover hidden talent.



The application acts as a “Digital Scout” for Physical Education teachers by:



Recording student athletic performance

Tracking improvement over time

Generating leaderboards

Awarding milestone badges

Visualizing athlete growth using graphs

Encouraging healthy competition among students



The system aligns with the goals of national initiatives such as Khelo India by promoting sports participation and identifying talented students at an early stage.



📱 Key Features

Feature	Description

Athlete Registration	Create athlete profiles with name, age, and sport

Trial Logger	Record sprint timings and athletic measurements

Stopwatch System	High-precision race timer with decimal accuracy

Room Database	Stores athlete data and performance history

Leaderboard	Displays rankings based on performance metrics

Talent Curve	Graphical performance analysis over time

Batch Entry	Add multiple student records quickly

Milestone Badges	Automatic achievement recognition

AI Integration	AI-assisted sports insights using Gemini API

🧭 User Flow

Teacher Login

&#x20;     ↓

Create Athlete Profile

&#x20;     ↓

Conduct Athletic Trial

&#x20;     ↓

Record Performance Data

&#x20;     ↓

Store Data in Room Database

&#x20;     ↓

Generate Leaderboard \& Graphs

&#x20;     ↓

Award Milestone Badges

&#x20;     ↓

Track Athlete Progress

🏗️ System Architecture

+------------------------------------------------+

|                Android Application             |

+------------------------------------------------+

&#x20;               |            |            |

&#x20;               |            |            |

&#x20;               v            v            v

&#x20;      +-------------+ +-------------+ +-------------+

&#x20;      | UI Layer    | | Logic Layer | | AI Layer    |

&#x20;      | Activities  | | Algorithms  | | Gemini API  |

&#x20;      +-------------+ +-------------+ +-------------+

&#x20;               |            |

&#x20;               |            |

&#x20;               v            v

&#x20;        +-------------------------+

&#x20;        |     Room Database       |

&#x20;        | Athlete \& Trial Data    |

&#x20;        +-------------------------+

&#x20;               |

&#x20;               v

&#x20;        +-------------------------+

&#x20;        | Analytics \& Graph View  |

&#x20;        +-------------------------+

⚙️ Technical Implementation

🔹 Frontend Development



The frontend of the application is developed using Android XML layouts and Kotlin activities in Android Studio. The UI is designed to be simple, responsive, and easy to use for teachers and students.



Major Activities

Activity	Purpose

MainActivity	Main dashboard and navigation

AthleteActivity	Athlete registration and profile management

TrialActivity	Record athletic trials and timings

BatchEntryActivity	Bulk student data entry

GraphActivity	Talent curve visualization

LeaderboardActivity	Display rankings and scores

GenAIActivity	AI-assisted athlete analysis

🔹 Backend Logic



The application logic is implemented using Kotlin.



Key functionalities include:



Stopwatch calculations

Performance analysis

Leaderboard ranking algorithms

Badge generation logic

Data validation

Performance sorting

🔹 Database Management



The application uses Room Database for local data storage.



Database Components

Component	Purpose

Athlete Entity	Stores athlete information

DAO Layer	Handles database operations

Room Database	Stores athlete trial history

Performance Records	Maintains historical analytics



Benefits of Room Database:



Offline storage support

Fast retrieval

Structured data management

Lifecycle-aware architecture

🔹 AI Integration



The application integrates Generative AI concepts using Gemini API.



AI features include:



Athlete performance insights

Sports recommendations

Growth analysis suggestions

Talent prediction assistance



This improves analytical capabilities and enhances user engagement.



📊 Talent Curve Analytics



The Talent Curve helps visualize athlete progress over time.



The graph module:



Tracks performance improvements

Displays trends visually

Helps identify consistent performers

Assists teachers in talent recognition



The graph is designed to be easy to interpret and suitable for school-level sports monitoring.



🏆 Milestone Badge System



The application automatically awards badges based on predefined athletic benchmarks.



Badge	Criteria

District Level Ready	Sprint time below benchmark

Rising Athlete	Continuous performance improvement

School Champion	Top leaderboard position



This gamification system motivates students and promotes healthy competition.



📈 Leaderboard System



The leaderboard ranks students according to their recorded athletic performance.



Features:



Automatic ranking updates

Sorting based on best performance

School-level competition tracking

Encourages regular participation



The leaderboard module uses sorting algorithms for efficient ranking generation.



🧪 Technologies Used

Technology	Purpose

Kotlin	Core application development

Android Studio	IDE for Android development

XML	UI design

Room Database	Local data persistence

Chronometer API	High-precision timer

MPAndroidChart	Graph visualization

Gemini API	Generative AI integration

Gradle	Build management

📂 Project Structure

KreedaPreranaScoutSports/

│

├── app/

│   ├── src/main/java/com/example/

│   │   ├── MainActivity.kt

│   │   ├── AthleteActivity.kt

│   │   ├── TrialActivity.kt

│   │   ├── GraphActivity.kt

│   │   ├── LeaderboardActivity.kt

│   │   ├── BatchEntryActivity.kt

│   │   ├── GenAIActivity.kt

│   │   ├── AppDatabase.kt

│   │   ├── Athlete.kt

│   │   └── AthleteDao.kt

│   │

│   └── res/layout/

│

├── gradle/

├── build.gradle.kts

└── settings.gradle.kts

✅ Success Criteria Achieved

Requirement	Status

Accurate stopwatch timing	✅ Implemented

Batch entry for 30 students	✅ Implemented

Talent curve visualization	✅ Implemented

Athlete data management	✅ Implemented

Leaderboard generation	✅ Implemented

AI integration	✅ Implemented

🌍 Social Impact

🏅 Khelo India Support



The application supports early talent identification and contributes toward grassroots sports development.



🏃 Physical Literacy



Encourages schools to maintain structured athletic records and promote fitness culture.



🌱 Equal Opportunity



Provides students in rural and remote areas with a digital sports identity and performance history.



🔮 Future Enhancements



Future improvements may include:



Cloud database synchronization

Multi-school analytics dashboard

Coach login system

National athlete database integration

AI-based performance prediction

Real-time competition mode

GPS-enabled sports tracking

Firebase authentication

📸 Screenshots



Add application screenshots here



\- Main Dashboard

\- Athlete Registration

\- Trial Logger

\- Talent Curve Graph

\- Leaderboard

\- AI Assistant Screen

🚀 Installation Steps

Prerequisites

Android Studio

Android SDK

Kotlin support

Internet connection for AI features

Steps

git clone https://github.com/GURUNATHDR/Mind-MatrixProject.git

Open project in Android Studio

Sync Gradle Files

Run the application on Emulator or Android Device

👨‍💻 Developer Information

Field	Details

Project Name	Kreeda-Prerana Scout

Domain	Android App Development using GenAI

Category	Sports Talent Identification

Platform	Android

IDE	Android Studio

Language	Kotlin

📚 Conclusion



Kreeda-Prerana Scout is a socially impactful Android application developed to modernize sports talent identification in schools. By combining athlete data management, analytics visualization, AI-assisted insights, and leaderboard systems, the application creates a structured digital ecosystem for grassroots sports development.



The project demonstrates the practical implementation of Android development, Room Database integration, AI-assisted functionality, and sports analytics in a real-world use case. It promotes equal opportunities for young athletes and contributes toward building a stronger sports culture through technology.



⭐ GitHub Repository



If you found this project useful, consider giving the repository a star.



⭐ Support the project by starring the repository.

