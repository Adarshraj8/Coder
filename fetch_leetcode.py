import requests

def fetch_submissions():
    url = "https://leetcode.com/problems/kth-largest-element-in-an-array/"
    response = requests.get(url)

    if response.status_code == 200:
        submissions = response.json()
        with open("leetcode_submissions.txt", "w") as file:
            file.write(str(submissions))
        print("LeetCode submissions fetched and saved successfully!")
    else:
        print("Failed to fetch submissions")

if __name__ == "__main__":
    fetch_submissions()
