**Git init**

`git init` initializes a new Git repository in the current directory. This creates a `.git` directory containing all of the necessary files to track changes to your files.

**Staging files**

To stage a file for commit, you use the `git add` command. This adds the file to the staging area, which is a temporary area where you can collect the changes that you want to include in your next commit.

**Git commit**

To commit your staged changes, you use the `git commit` command. This creates a new snapshot of your project, along with a commit message that describes the changes you made.

**Versions and snapshots**

Each Git commit is a snapshot of your project at a specific point in time. This means that you can easily revert to previous versions of your project if necessary.

**Does storing snapshots of the entire project waste space with Git?**

Git does not waste space by storing snapshots of the entire project. Instead, Git uses a technique called delta encoding to store only the changes that were made in each commit. This means that Git repositories are typically much smaller than you might expect.

**Does Git compress content?**

Yes, Git compresses content using a technique called zlib. This helps to reduce the size of Git repositories even further.

**Does Git store duplicate content?**

Git does not store duplicate content. If you add a file to your Git repository that is already present in the repository, Git will not create a new copy of the file. Instead, Git will simply link to the existing copy of the file.

**What does a Git commit have?**

A Git commit has the following information:

* ID: A unique identifier for the commit.
* Message: A description of the changes that were made in the commit.
* Date/time: The date and time when the commit was created.
* Author: The name and email address of the person who created the commit.
* Snapshot: A complete snapshot of the project at the time the commit was created.

**What happens when we make changes to a project?**

When you make changes to a project, Git will track the changes. You can see the changes that you have made by running the `git status` command.

**What happens when we write `git init`?**

When you write `git init`, Git creates a new `.git` directory in the current directory. This directory contains all of the necessary files to track changes to your files.

**What does `git init` do?**

`git init` does the following:

* Creates a `.git` directory in the current directory.
* Initializes a new Git repository in the `.git` directory.
* Creates a default branch called `master`.

**What do we do when we add files?**

To add files to your Git repository, you use the `git add` command. This adds the files to the staging area, which is a temporary area where you can collect the changes that you want to include in your next commit.

**What happens to the files we delete?**

When you delete a file from your Git repository, Git will track the deletion. You can see the files that you have deleted by running the `git status` command.

**Do snapshots reflect the changes made?**

Yes, snapshots reflect the changes that were made to the project at the time the snapshot was created.

Here is a code sample that shows how to use Git to initialize a new repository, add a file to the repository, and commit the file:

```
# Initialize a new Git repository
git init

# Add a file to the repository
git add README.md

# Commit the file
git commit -m "Add README.md file"
```

You can then view the history of your repository by running the `git log` command.

```
# View the history of the repository
git log
```

This will show you a list of all of the commits that have been made to the repository. You can click on a commit to view the changes that were made in that commit.

I hope this helps!


