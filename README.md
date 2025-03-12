

# **🍽 Multi-Threaded Restaurant Order Management System**  

## **📌 Project Overview**
This project simulates a **multi-threaded restaurant order management system**, where multiple **customers** place orders simultaneously, and multiple **cooks** process them. The system ensures **VIP customers get priority**, and orders are processed efficiently using **thread synchronization**.  

---

## **🛠 Tech Stack**
- **Language:** Java  
- **Concepts Used:** Multithreading, Synchronization, Priority Queue, Thread Communication  
- **Collections Used:** `PriorityBlockingQueue` for thread-safe order management  

---

## **🚀 Features**
✅ **Multi-threaded System** – Customers and Cooks run as independent threads  
✅ **Priority-based Order Processing** – VIP customers get priority  
✅ **Efficient Order Management** – Uses `PriorityBlockingQueue` for concurrency  
✅ **Scalable** – Can add more Customers and Cooks dynamically  
✅ **Thread Synchronization** – Ensures proper execution without race conditions  

---

## **📂 Project Structure**
```
restaurant-system/
│── src/
│   ├── Management/
│   │   ├── Order.java
│   │   ├── Restaurant.java
│   │   ├── Customer.java
│   │   ├── Cook.java
│   ├── Supervisour/
│   │   ├── Main.java
│── README.md
```

---

## **📜 How It Works**
1️⃣ **Customers (Threads) place orders**  
2️⃣ **Orders are stored in a priority queue** (`PriorityBlockingQueue<Order>`)  
3️⃣ **Cooks (Threads) process orders in priority order**  
4️⃣ **Orders are prepared and marked as completed**  

---

## **🔧 Setup Instructions**
### **🔹 Prerequisites**
- Install **Java JDK 8+**  
- Set up **Git** (optional for version control)  

### **🔹 Clone the Repository**
```sh
git clone https://github.com/your-username/multi-threaded-restaurant.git
cd multi-threaded-restaurant
```

### **🔹 Compile and Run**
```sh
javac Management/*.java Supervisour/*.java
java Supervisour.Main
```

---

## **📝 Sample Output**
```
📝 Order Placed: Order #1 by Ayan (VIP)
📝 Order Placed: Order #2 by Amit
📝 Order Placed: Order #3 by Soniya (VIP)
📝 Order Placed: Order #4 by Sayak
📝 Order Placed: Order #5 by Mainak (VIP)
👨‍🍳 Cooking Order: Order #1 by Ayan (VIP)
✅ Order Ready: Order #1 by Ayan (VIP)
👨‍🍳 Cooking Order: Order #3 by Soniya (VIP)
✅ Order Ready: Order #3 by Soniya (VIP)
👨‍🍳 Cooking Order: Order #5 by Mainak (VIP)
✅ Order Ready: Order #5 by Mainak (VIP)
👨‍🍳 Cooking Order: Order #2 by Amit
✅ Order Ready: Order #2 by Amit
👨‍🍳 Cooking Order: Order #4 by Sayak
✅ Order Ready: Order #4 by Sayak
```

---

## **📌 Future Enhancements**
🚀 **Better Logging** – Use `java.util.logging` instead of `System.out.println`  
🚀 **Graphical User Interface (GUI)** – A simple Java Swing/JavaFX frontend  
🚀 **Database Integration** – Store orders & customers using MySQL/PostgreSQL  

---

## **📜 License**
This project is **open-source** and available under the **MIT License**. Feel free to contribute! 😊  


