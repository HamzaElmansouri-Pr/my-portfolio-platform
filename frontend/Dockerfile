# 1. Base Image (UPDATED to Node 20)
FROM node:20-alpine

# 2. Set Working Directory
WORKDIR /app

# 3. Copy Dependency Files
COPY package.json package-lock.json* ./

# 4. Install Dependencies
RUN npm install

# 5. Copy the rest of the application code
COPY . .

# 6. Disable Next.js Telemetry (Privacy)
ENV NEXT_TELEMETRY_DISABLED=1

# 7. Expose the port
EXPOSE 3000

# 8. Start the app in Development Mode
CMD ["npm", "run", "dev"]