import requests
import argparse

parser = argparse.ArgumentParser(description='directory scan tool')
parser.add_argument('-u', '--url', help='input any URL')
parser.add_argument('-w', '--wordlist', help='wordlist path')

args = parser.parse_args()

url = args.url
wordlist = args.wordlist

def result(full):
    r = requests.get(full)
    print(full)
    return r.status_code
    

def readlist(url,wordlist):
    with open(wordlist) as f:
        for line in f:
            full = (url + "/" + str(line))
            print(result(full))
            print("\n\n")

readlist(url,wordlist)
