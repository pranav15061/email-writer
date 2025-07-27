# AI-Powered Email Reply Assistant (Chrome Extension + Spring Boot + Gemini API)

This project is a Chrome extension that integrates with Gmail to automatically generate professional email replies using Google's Gemini AI API.

## 🚀 Features
- Adds a custom **"AI Reply"** button in Gmail's reply and forward interface.
- Captures the content of the original email and sends it to a Spring Boot backend.
- Backend communicates with the **Gemini LLM API**, constructs prompt based on tone and content, and returns a smart, contextual reply.
- Automatically inserts the AI-generated response into the Gmail compose box.
- Supports tone customization (e.g., professional, friendly, etc.).
- Lightweight and responsive, built using **JavaScript (content script)** and **Spring Boot** with `WebClient`.

## 🛠️ Tech Stack
- **Frontend**: JavaScript, Chrome Extension APIs, DOM Manipulation, HTML/CSS
- **Backend**: Spring Boot, WebClient, Jackson (JSON parsing)
- **AI Model**: Gemini Pro (via Google AI Studio API)

## 📦 How it Works
1. When a reply/forward window opens in Gmail, the extension injects an “AI Reply” button.
2. Clicking the button sends the visible email content to the backend.
3. The backend builds a prompt and queries Gemini API.
4. Gemini generates a suitable reply based on the tone and content.
5. The reply is automatically inserted back into Gmail’s compose area.

## 💡 Use Cases
- Quickly generate professional email responses.
- Save time drafting replies with context-aware suggestions.
- Great productivity tool for frequent email users.

## 📷 Screenshot
![Gmail extension with AI Reply button](./screenshot.png)

## 🔐 Note
Make sure to store your Gemini API key securely in the `application.properties` file on the backend.

