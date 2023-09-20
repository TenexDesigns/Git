Branching in Git is a powerful feature that allows developers to create independent lines of development. Here are the key concepts and commands related to branching in Git, along with some code examples.

**What are Branches**

A branch in Git is essentially a unique set of code changes with a unique name. Each repository can have one or more branches. The main branch (default is 'master') is the one that contains the official code. Other branches are used to develop features isolated from each other [Source 1](https://www.atlassian.com/git/tutorials/using-branches).

**Working with Branches**

The `git branch` command lets you create, list, rename, and delete branches.

Creation of a new branch:

```shell
git branch <branch-name>
```

Listing all branches:

```shell
git branch
```

Renaming a branch:

```shell
git branch -m <old-name> <new-name>
```

Deleting a branch:

```shell
git branch -d <branch-name>
```
[Source 1](https://www.atlassian.com/git/tutorials/using-branches)

**Switching Branches**

You can switch from one branch to another using the `git checkout` command:

```shell
git checkout <branch-name>
```

From Git version 2.23 onwards you can use `git switch` instead of `git checkout` to switch branches:

```shell
git switch <branch-name>
```
[Source 0](https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell)

**Comparing Branches**

The `git diff` command can be used to compare branches:

```shell
git diff <branch1>..<branch2>
```
[Source 6](https://www.freecodecamp.org/news/how-to-work-with-branches-in-git/)

**Merging**

The `git merge` command is used to combine the changes made on one branch with another branch:

```shell
git checkout <branch-name>
git merge <branch-name>
```
[Source 0](https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell)

**Handling Merge Conflicts**

Sometimes, merging branches can result in merge conflicts. Git will not be able to merge the branches automatically and will need your help to decide which changes to keep. You can resolve the conflicts manually by editing the files, marking them as resolved with `git add`, and then committing the resolved changes:

```shell
# Edit files to resolve conflicts
git add <resolved-file>
git commit -m "Resolved merge conflict"
```
[Source 0](https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell)

**Stashing**

The `git stash` command allows you to temporarily save changes that you don't want to commit immediately. You can apply the stashed changes later:

```shell
git stash
# Do some work and commit
git stash apply
```
[Source 5](https://www.freecodecamp.org/news/how-to-use-branches-in-git/)

**Rebasing**

The `git rebase` command allows you to move or combine a sequence of commits to a new base commit. It's an alternative to `git merge`:

```shell
git checkout feature
git rebase master
```
[Source 1](https://www.atlassian.com/git/tutorials/using-branches)












