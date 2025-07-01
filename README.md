# Music Streaming Platform Revenue Tracker
** Project Overview **

The Music Streaming Platform Revenue Tracker is a Java-based application designed to help artists monitor and analyze their earnings from major music streaming platforms like Spotify, Amazon Music, and YouTube Music. The tool provides a structured breakdown of revenue based on streaming hours, categorizes artists into different tiers (Mainstream, Indie, Emerging), and includes a goal-setting feature to help artists track their career milestones.

# Key Features:
- Revenue Calculation – Estimates earnings based on streaming hours and platform-specific payout rates.
-  Multi-Platform Support – Works with Spotify, Amazon Music, and YouTube Music.
-   Artist Categorization – Classifies artists into Mainstream, Indie, or Emerging based on streaming performance.
-    Goal Setting – Allows artists to set and track career goals (e.g., album releases, streaming milestones).
- User friendly Interface – Available in both CLI (Command Line) and GUI (JavaFX) versions. 
- Data Privacy – Manual data entry ensures confidentiality (no external database integration)

# Technologies & Concepts Used
- Programming Language: Java
- Object-Oriented Programming (OOP) Concepts:

1. Inheritance (Base StreamingPlatform class extended by Spotify, AmazonMusic, YouTubeMusic)
2. Polymorphism (Overriding calculateEarnings() method for each platform)
3. Abstraction (Using abstract classes and interfaces like EarningsCalculable)
4. Encapsulation (Private fields with getters/setters)

- GUI Framework: JavaFX (for interactive UI)
- Development Tools: Eclipse

# Project Structure
1. Revenue Tracker
Core Logic:
- StreamingPlatform (Abstract Base Class)
- Spotify, AmazonMusic, YouTubeMusic (Subclasses with platform-specific earnings logic)
- RevenueTrackerClass (CLI version)
- RevenueTracker (JavaFX GUI version)

2. How Revenue is Calculated?
 ```
| **Platform**      | **Streaming Hours ≥ 200K**       | **50K ≤ Hours < 200K**      | **Hours < 50K**       |
|-------------------|----------------------------------|-----------------------------|-----------------------|
| **Spotify**       | ₹0.74/hr + ₹50K bonus            | ₹0.54/hr + ₹40K bonus       | ₹0.41/hr + ₹5K bonus  |
| **Amazon Music**  | ₹0.68/hr + ₹50K bonus            | ₹0.57/hr + ₹40K bonus       | ₹0.44/hr + ₹5K bonus  |
| **YouTube Music** | ₹0.70/hr + ₹50K bonus            | ₹0.64/hr + ₹40K bonus       | ₹0.60/hr + ₹5K bonus  |
```

# 2. Goal Setting Module
- Core Classes:
    - Goal (Stores goal details: description, deadline, achievement status)
    - Artist (Manages artist goals)
    - AppGoalSetting (CLI version)
    - GoalFx (JavaFX GUI version)

- Features:

  - Add new goals (e.g., "Release new album by Dec 2024")
  - View all goals
  - Mark goals as achieved

#  How to Run 
1. Command Line (CLI) Version
   - Compile & Run:
     ```javac RevenueTrackerClass.java
java RevenueTrackerClass ```

Input:

- Enter artist name and streaming hours for each platform.
- The program will display earnings per platform and total revenue.

2. JavaFX (GUI) Version
   - Run RevenueTracker.java (for Revenue Tracking) or GoalFx.java (for Goal Setting).

Features:
- Interactive UI for entering data.
- Visual breakdown of earnings.
- Goal management system.

  # Sample output
  ```Input Artist Information  
Enter Artist Name: TaylorSwift  
Enter Streaming Hours for Spotify: 250000  
Enter Streaming Hours for Amazon Music: 180000  
Enter Streaming Hours for YouTube Music: 300000  

Calculating and displaying earnings for each platform:  

Platform: Spotify  
Artist: TaylorSwift  
Streaming Hours: 250000.0  
Earnings: Rs 235000.0  

Platform: Amazon Music  
Artist: TaylorSwift  
Streaming Hours: 180000.0  
Earnings: Rs 167600.0  

Platform: YouTube Music  
Artist: TaylorSwift  
Streaming Hours: 300000.0  
Earnings: Rs 260000.0  

Total Earnings: Rs 662600.0   ```

# Conclusion
This project provides artists with financial transparency and career planning tools, helping them optimize their earnings and set achievable milestones. Its modular OOP design makes it scalable for future improvements.
