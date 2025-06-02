import requests

def fetch_submissions():
    # Replace this URL with the correct API endpoint for fetching LeetCode submissions
    url = "https://leetcode.com/api/submissions/"
    
    response = requests.get(url)

    if response.status_code == 200:
        submissions = response.json()

        # Debugging: Print some data to confirm it's working
        print("Fetched submissions:", submissions)
        
        # Save the fetched data to a file
        with open("leetcode_submissions.txt", "w") as file:
            file.write(str(submissions))  # Save submissions to the file
        print("LeetCode submissions saved to leetcode_submissions.txt")
    else:
        print(f"Failed to fetch submissions: {response.status_code}")

if __name__ == "__main__":
    fetch_submissions()
