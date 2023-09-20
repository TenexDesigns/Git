When you clone a repository, by default, you clone the entire repository including all branches. This allows you to have a local copy of the entire project and switch between branches as needed. However, you can also choose to clone only a specific branch if you don't need the entire repository. 

To clone a specific branch, you can use the `git clone` command followed by the `-b` flag and the name of the branch you want to clone. For example, to clone a repository and only get the "develop" branch, you can use the following command:
```
git clone -b develop <repository_url>
```
This will create a local copy of the "develop" branch.

Now, let's move on to your second question. If you are working on a branch but you're not done with it yet, you have a few options:

1. **Commit and continue working on the branch**: If you have made changes to the branch and want to save your progress, you can commit the changes using the `git commit` command. This will save your changes locally on the branch. Later, when you're ready to continue working on the branch, you can simply pull the latest changes from the remote repository using `git pull`. This will update your local branch with any changes that have been made by others on the remote branch.

2. **Create a new branch**: If you're not ready to commit your changes or if you want to work on a different feature without affecting the current branch, you can create a new branch based on your current branch. This allows you to have multiple branches with different sets of changes. To create a new branch, you can use the `git branch` command followed by the name of the new branch. For example:
```
git branch new-branch
```
This will create a new branch named "new-branch" based on your current branch. You can then switch to the new branch using the `git checkout` command:
```
git checkout new-branch
```
Now, you can continue working on the new branch without affecting the original branch.

In summary:
- When you clone a repository, you clone all the branches by default.
- You can choose to clone only a specific branch using the `-b` flag with the `git clone` command.
- If you're working on a branch but not done with it yet, you can commit your changes and pull later to continue working, or create a new branch to work on a different feature without affecting the current branch.

Sources:
- [Git Clone Branch – How to Clone a Specific Branch](https://www.freecodecamp.org/news/git-clone-branch-how-to-clone-a-specific-branch/)
- [Clone and make a change on a new branch](https://support.atlassian.com/bitbucket-cloud/docs/clone-and-make-a-change-on-a-new-branch/)
- [Creating a New Branch and Pulling Changes from Another Branch](https://www.prepbytes.com/blog/git/creating-a-new-branch-and-pulling-changes-from-another-branch/)

