#  Fetch Rewards Challenge

## 📌 Overview
This Android application retrieves a list of items from an API, then filters, sorts and displays it 

## ✨ Features
-  API Integration: Retrieves data using Retrofit.  
-  Data Processing: Filters out items with null or empty names.  
-  Sorting Mechanism: Orders items by `listId` and then alphabetically by `name`.  
-  UI: Displays data efficiently using `RecyclerView`.  

---

## 🛠 Running the app

### Cloning the Repository
git clone https://github.com/Prriyansh/FetchRewardsChallenge.git

### Android Studio
1. Launch Android Studio.
3. Navigate to the `FetchRewardsChallenge` directory and open it.  

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
- 📌 **Sorting Order**: Data is sorted **first by `listId` (ascending)** and then **by `name` (ascending, case-sensitive)**.  

### User Interface
- RecyclerView efficiently renders the list of items.  

---

## ⚠️ Edge Cases Considered
- Null or Empty Names: These are removed before displaying the list.  
- Sorting Consistency: Ensures reliable ordering of data.  
- API Failures: Displays an error message if the network request fails.  
- Performance Optimization: Uses `RecyclerView` with ViewHolder pattern for smooth scrolling.  

---

## 🌍 API Reference
The application fetches data from:  
🔗 `https://fetch-hiring.s3.amazonaws.com/hiring.json`

---

## 📦 Dependencies
- Retrofit: API calls and data fetching  
- Gson: JSON serialization
- RecyclerView: Efficient UI rendering  

---
