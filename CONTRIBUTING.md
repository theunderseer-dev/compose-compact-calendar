# Contributing

The project is in bootstrap. The calendar API, quality tasks, and CI are not yet
complete. Check existing Issues before proposing a feature or bug fix, and keep
each change focused on one useful outcome.

## Discuss the change first

Link your work to an existing GitHub Issue, or open a focused issue using the
task template. Use its actual GitHub number when naming the branch.

Before implementing any new feature or a major change, describe the problem,
proposed scope, acceptance criteria, and verification approach in the issue.
Wait for explicit agreement from the maintainer on that scope. Major changes
include public API changes, architectural changes, new platforms, introducing
or replacing dependencies, and broad refactors. An open issue or silence is
not approval to start work.

Small bug fixes, documentation corrections, and focused tests do not require
prior scope approval. Keep them linked to an issue, and avoid adding unrelated
features or refactoring. If the agreed scope changes substantially, discuss it
in the issue before extending the implementation.

## Fork, branch, and pull request

1. External contributors fork the repository and clone their fork. Maintainers
   may create a branch directly in the main repository.
2. Start a dedicated branch from the latest upstream `main`, using the naming
   convention below. Make changes on that branch rather than on `main`.
3. Implement the agreed scope in small, coherent commits. Include relevant tests
   and documentation, run applicable checks, and review the diff for unrelated
   changes or secrets. Keep finished commits independently valid.
4. Push the branch to your fork (or the main repository for maintainers), then
   open a PR targeting `theunderseer-dev/compose-compact-calendar:main`.
5. Use the PR template, link the issue, and report actual automated/manual checks
   and pending limitations. Use `Closes #<issue-number>` only if the PR completes
   that issue; otherwise use a non-closing reference such as `Refs #<issue-number>`.
6. Address maintainer feedback on the same branch. A draft PR can be used for
   early feedback; mark it ready for review when the change is ready.

Creating a PR does not grant merge permission or guarantee acceptance. A
maintainer reviews and merges accepted changes. Direct pushes to `main` are
outside the contribution workflow.

## Branch names

Use `<type>/<issue-number>-<short-description>` with lowercase English words
separated by hyphens. The number is the real GitHub Issue number, not its local
CAL planning ID. For example, `feat/123-week-calendar` refers to GitHub Issue
123; the number is illustrative, not an existing issue assignment.

| Type | Use |
| --- | --- |
| `feat` | New functionality |
| `fix` | Bug fixes |
| `docs` | Documentation |
| `refactor` | Restructuring without an intended behavior change |
| `test` | Focused test changes |
| `chore` | Build tooling and repository maintenance |

Keep each branch/PR focused on one outcome. A short descriptive commit title
should explain its change; branch naming does not require every commit title
to repeat the issue number.

## Development

Open the project root in Android Studio with the Kotlin Multiplatform plugin
and use the checked-in Gradle Wrapper/version catalog. Android requires an SDK;
iOS requires macOS and a compatible, initialized Xcode installation.
Keep local SDK configuration and credentials untracked.

The generated scaffold provides these development commands:

```bash
./gradlew tasks --all
./gradlew :androidApp:assembleDebug
./gradlew :desktopApp:run
```

These commands are guidance, not a claim of successful verification. Derive
additional compilation/test task names from the actual build. Bootstrap will
add verified formatting/static-analysis commands and a compatibility matrix.

## Checks and pull requests

- Use meaningful date/range unit tests and observable UI behavior/semantics tests
  when the changed functionality exists. Avoid dummy or implementation-mirroring
  tests. Check affected sample behavior manually where needed.
- Report the commands actually run, their results, and any unverified platforms
  or blockers. A skipped, NO-SOURCE, or unrun check is not a passing test.
- Use the task and PR templates. Describe the resulting behavior and provide
  enough verification evidence for a reviewer.
- Link a PR to an actual issue with a closing reference when appropriate, such
  as `Closes #123`; local CAL planning IDs are not GitHub issue numbers.
- Keep code/API names and public documentation in English. Preserve the
  independent library API and avoid introducing consumer-specific business logic.

## Merge strategy

Accepted PRs are merged using **Create a merge commit**. Preserve the individual
reviewed commits and the PR boundary; do not squash or rebase on merge. Each PR
may contain several small, coherent, verified commits.

Merge only after the agreed acceptance criteria, applicable local/manual checks,
and any configured required CI checks are satisfied. Pending bootstrap tooling
must not be presented as already configured or passing. Repository permissions
and branch rules enforce access; these contribution instructions do not grant it.
