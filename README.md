How to push/pull with github
!Do not push into master branch!

General structure
[eclipse workspace] -commit-> [local repository (git)] -push-> / <-pull- [remote repo (github)]

Initially:
- accept invitation to collaborate
- clone project locally in eclipse:
  - search -> git repositories
  - click clone git repository
  - paste repo url
  - login with username and the github access token
  - click finish
- import the project into eclipse workspace:
  - under package explorer:
  - rightclick -> import -> projects from git -> existing local repo -> click next until finish
- now you can change/add files or classes

Only once: Create new branch (name it after your name or github name e.g. BranchTimo):
- under git repositories -> rightclick branches -> name it and click finish

Commit new code to local repo:
- rightclick the project in the package explorer -> team -> add to index
- rightclick the project in the package explorer -> team -> commit
- add commit message (e.g. committing class x.java to BranchTimo)
- commit (make sure you are not committing to master)

Push code from local repo to remote repo:
- under got repositories rightclick your Branch
- push branch -> preview -> login -> push -> login again if neccessary

Committed the fixed Listed in the GUI

Create Pull request (also send the new branch/changes to review):
- login to your github and go to the repo
- select your branch -> new pull request
- add lead to reviewers
- add message and create pull request
- make sure it says base:master <- compare:BranchTimo and able to merge behind it
- if the lead sends the message that you can merge the code -> click merge pull request -> confirm merge
- added files should be merged to master branch
- keep working in your own branch and repeat the process
