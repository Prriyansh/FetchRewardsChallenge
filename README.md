#  Fetch Rewards Challenge

## 📌 Overview
A native Android application built using Java to fetch, filter, and display data from an API. The app presents sorted data in a clean and structured RecyclerView

## ✨ Features
-  API Integration: Retrieves data using Retrofit.  
-  Data Processing: Filters out items with null or empty names.  
-  Sorting Mechanism: Orders items by `listId` and then alphabetically by `name`.  
-  UI: Displays data efficiently using `RecyclerView`.  

---

## 📁 Repository Structure
The main files are located in:

```
FetchRewardsChallenge/
│── app/                    
│   ├── src/                
│   │   ├── main/           
│   │   │   ├── java/com/example/fetchrewardschallenge/
│   │   │   │   ├── MainActivity.java           # Entry point of the app
│   │   │   │   ├── model/Item.java             # Data model for API response
│   │   │   │   ├── network/ApiService.java     # Retrofit API interface
│   │   │   │   ├── network/RetrofitClient.java # API client setup
│   │   │   │   ├── ItemAdapter.java            # RecyclerView adapter
│   │   │   ├── res/layout/activity_main.xml    # Main UI layout
│   │   │   ├── res/layout/item_layout.xml      # Layout for each list item

```

---

## 🛠 Running the app

### Cloning the Repository
-  Use command: git clone https://github.com/Prriyansh/FetchRewardsChallenge.git

### Android Studio
1. Launch Android Studio.
2. Navigate to the `FetchRewardsChallenge` directory and open it.  

###  Running the Application
1. Connect to an Android Device or a emulator
2. Click on Run ▶ 
3. The application should launch, fetch data from the API, and display it in the structured format.  

---

## 🔍 Implementation Details

### Network Requests
- Uses Retrofit for API communication.  
- The API response is deserialized into `Item` objects using Gson.  

### Data Processing
-  Null or Empty Names: These are removed from the dataset.  
-  Sorting Order: Data is sorted **first by `listId` (ascending)** and then **by `name` (ascending, case-sensitive)**.  

### User Interface
- RecyclerView efficiently renders the list of items.  

---

## ⚠️ Edge Cases Considered
- Null or Empty Names: These are removed before displaying the list.  
- Sorting Consistency: Ensures reliable ordering of data.  
- API Failures: Displays an error message if the network request fails.  
- Performance Optimization: Uses `RecyclerView` with ViewHolder pattern for smooth scrolling.  

---

## 📦 Dependencies
- Retrofit: API calls and data fetching  
- Gson: JSON serialization
- RecyclerView: Efficient UI rendering  

---
