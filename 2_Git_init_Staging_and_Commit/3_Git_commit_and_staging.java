**Git Init**

The `git init` command is used to create a new Git repository. It initializes a new repository in the current directory by creating a .git subdirectory, which contains all the necessary metadata for the new repository. This metadata includes subdirectories for objects, refs, and template files. Running `git init` in an existing repository is safe and will not overwrite things that are already there [Source 12](https://git-scm.com/docs/git-init), [Source 7](https://www.git-tower.com/learn/git/commands/git-init/).

For example, to create a new repository, you would navigate to your project's directory and run the following command:

```
cd /path/to/your/project
git init
```

**Staging Files**

In Git, staging is the process of preparing changes in your working directory for a commit. The `git add` command is used to add changes to the staging area. Git tracks changes to files in the staging area and includes these changes in the next commit [Source 0](https://www.freecodecamp.org/news/how-to-use-git-best-practices-for-beginners/).

For example, to add a file named `file.txt` to the staging area, you would run:

```
git add file.txt
```

**Git Commit**

The `git commit` command is used to save changes in the staging area to the repository. Each commit represents a snapshot of the project at a specific point in time. The `git commit` command also requires a message describing the changes made in the commit [Source 4](https://www.atlassian.com/git/tutorials/saving-changes/git-commit).

For example, to commit changes with a message, you would run:

```
git commit -m "Your commit message"
```

**Versions and Snapshots**

In Git, each commit is considered a separate version of the project. Git stores these versions as snapshots rather than as a series of changes. This means that for each commit, Git stores a snapshot of how all the files in your project look at that commit. When you make changes to your project, Git creates a new snapshot and stores a reference to it [Source 8](https://www.git-scm.com/book/en/v2/Getting-Started-What-is-Git%3F).

**Does Storing Snapshots Waste Space?**

Git uses a number of techniques to minimize the space used by the repository. While it does store snapshots of the entire project for each commit, it doesn't store duplicate content. If a file hasn't changed from one commit to the next, Git doesn't store a new copy of the file. Instead, it just links to the existing file. 

Additionally, Git compresses the content it stores, which helps to reduce the amount of space used by the repository. Git also periodically runs a garbage collection process (`git gc`), which cleans up unnecessary files and optimizes your Git repository [Source 24](https://www.atlassian.com/git/tutorials/git-gc).

**Commit Object**

Each commit in Git is a commit object that contains the following information:

- A unique identifier (SHA-1 hash) for the commit.
- The commit message describing the changes made in the commit.
- The date and time of the commit.
- The author of the commit.
- A reference to the snapshot of the project at the time of the commit [Source 9](https://git-scm.com/docs/user-manual).

For example, when you run `git commit -m "Your commit message"`, Git creates a new commit object with a unique identifier, the commit message "Your commit message", the current date and time, your name as the author, and a reference to the current state of the project.

**Changes to the Project**

When you make changes to your project, you can stage these changes using the `git add` command. Once you've staged your changes, you can create a new commit with the `git commit` command. This creates a new snapshot of your project, which includes the changes you've made [Source 0](https://www.freecodecamp.org/news/how-to-use-git-best-practices-for-beginners/).

For example, if you modify a file called `file.txt`, you can stage this change and create a new commit with the following commands:

```
git add file.txt
git commit -m "Modified file.txt"
```

**Deleted Files**

When you delete a file in your working directory, Git notices the file is missing. However, this change is not immediately included in the next commit. You need to stage the deletion with the `git rm` command, which removes the file and stages the deletion. When you next commit, the file will be removed from your Git repository as well [Source 0](https://www.freecodecamp.org/news/how-to-use-git-best-practices-for-beginners/).

For example, to delete a file named `file.txt` and stage the deletion, you
