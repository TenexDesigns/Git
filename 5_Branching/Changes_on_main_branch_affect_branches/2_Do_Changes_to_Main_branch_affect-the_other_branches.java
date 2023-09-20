In Git, changes made to the main branch can affect other branches. It is generally recommended to make changes to the main branch through branching and merging rather than making direct changes. This approach allows for better organization, collaboration, and version control. Here's the recommended way for making changes to the main branch and how it applies to collaborators and maintainers:

1. **Create a new branch**: When you want to make changes to the main branch, create a new branch from the main branch. This new branch will serve as a separate line of development for your changes. You can create a branch using the `git branch` command followed by the branch name, or use the `git checkout -b` command to create and switch to the new branch in one step.

2. **Make changes in the new branch**: Switch to the new branch and make your changes there. This ensures that the main branch remains unaffected by your changes until they are ready to be merged.

3. **Commit and push changes**: Once you have made the desired changes in the new branch, commit them using the `git commit` command. It is important to provide clear and descriptive commit messages to track the changes made. After committing, push the changes to the remote repository using the `git push` command.

4. **Review and merge**: Collaborators and maintainers can review the changes made in the new branch and provide feedback if necessary. Once the changes are reviewed and approved, the branch can be merged into the main branch. This can be done through a pull request or by using the `git merge` command.

5. **Delete the branch**: After the changes are merged into the main branch, the new branch can be deleted. This helps keep the repository clean and organized. Use the `git branch -d` command to delete the branch locally, and `git push origin --delete <branch-name>` to delete the branch from the remote repository.

By following this process, you can maintain a clear separation between the main branch and the changes being made, allowing for better collaboration, easier code review, and a more controlled version history.

Sources:
- [Source 3](https://learn.microsoft.com/en-us/azure/devops/repos/git/git-branching-guidance?view=azure-devops)
- [Source 4](https://www.freecodecamp.org/news/git-branching-commands-explained/)
- [Source 5](https://docs.github.com/en/repositories/configuring-branches-and-merges-in-your-repository/managing-branches-in-your-repository/changing-the-default-branch)

