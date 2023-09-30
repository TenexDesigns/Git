**Git Workflow**

The typical order of operations in a Git workflow is as follows:

1. You create your project files and directories in your local system.

2. You initialize a new Git repository in the project's root directory using `git init`. This creates a new .git subdirectory, which contains all the metadata Git needs to track changes.

```shell
cd /path/to/your/project
git init
```

3. You stage your project files using `git add`. This adds a snapshot of your project to Git's staging area, marking it for inclusion in the next commit. 

```shell
git add .
```

4. You commit the staged snapshot to the repository using `git commit`. This saves the snapshot to the repository and associates it with a commit message, which describes the changes you made.

```shell
git commit -m "First version of the project"
```

// `


8.      git branch -M main
  
9.     git remote add origin https://github.com/TenexDesigns/Labsky.git

10.    git push -u origin main




  ---------------------------------------------

  5. As you continue working on your project, you make changes to your files and directories. You do not need to run `git init` again; the repository is already initialized.

6. You stage the modified project using `git add` again. This adds a snapshot of the modified project to the staging area.

```shell
git add .
```

7. You commit the staged snapshot to the repository using `git commit`. This creates a new commit that represents the current state of the project.

```shell
git commit -m "Second version of the project"



  

**How Does Git Store Changes?**

Each commit in Git is a snapshot of the entire project at a specific point in time. When you create a new commit, Git doesn't just store the differences from the previous commit; it stores a snapshot of how all the files in your project look at that moment.

However, Git is smart about how it stores these snapshots. If a file hasn't changed from one commit to the next, Git doesn't store a new copy of the file. Instead, it just links to the existing file. This means that even though Git stores a snapshot of the entire project for each commit, it doesn't waste space storing duplicate copies of unchanged files [Source 8](https://www.git-scm.com/book/en/v2/Getting-Started-What-is-Git%3F).

Therefore, Git enables you to access the complete state of your project at any commit. For instance, you can view the initial state of your project by checking out the first commit, and you can view the state of your project after changes were made by checking out the second commit.






  A highly motivated and adaptable Fullstack Developer with a strong passion for creating robust and efficient web applications. Proficient in JavaScript, Java, Spring, React, Next.js, and SQL. Seeking opportunities to contribute to dynamic development teams and leverage technical expertise to build innovative software solutions.






  ...
