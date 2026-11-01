# Contributor guidance for coding agents

Read README.md, CONTRIBUTING.md, and the supplied issue/task before changing code.
This file provides working instructions; it does not enforce tool or filesystem
permissions, and consumers do not need it to use the library.

## Scope and design

- Implement the requested task only, with appropriate checks and documentation.
- Keep the calendar independent of consuming applications and their domain models.
- Prefer small, focused functions/classes and composition over inheritance.
- Place standalone components/types in their own files; separate date arithmetic,
  formatting, day rendering, and styling. Small related private helpers may stay
  next to their caller. Avoid speculative abstractions and empty packages.
- Use one publishable calendar module and separate sample hosts. During bootstrap,
  the generated shared module is sample scaffolding, not the finished library.
- Limit library runtime dependencies to needed Compose primitives and
  kotlinx-datetime. DI, persistence, and networking are unnecessary.
- Keep state/business data in the host. Today, selected, completed, and enabled
  are independent attributes. Read-only is distinct from disabled.
- The baseline is seven dates, English weekday above date number, configurable
  week start with Monday as default, and optional host-controlled activation.
- Use replaceable day content/formatting. Paging and expansion default to off.
  Expansion means a fixed count of consecutive weeks from the visible week,
  including it; exact defaults and paging rules belong to their approved tasks.
- Kotlin package names and Maven groupId are independent. Publication coordinates
  must use a namespace the maintainer has actually verified.

## Verification

- Use primary Android Developers, Kotlin, JetBrains, and Gradle documentation.
- Verify compatible stable dependency/tool versions rather than upgrading each
  independently. Document actual minimum requirements and platform evidence.
- Use TDD for date/range logic and UI tests for observable interaction/semantics.
  Do not add dummy tests for an empty scaffold.
- Run appropriate checks; report failures, blockers, skipped/NO-SOURCE/unrun tests,
  and pending manual/platform checks accurately.
- Keep comments, API names, KDoc, and public documentation in English.

## Access boundaries

- Use only files/tools authorized for the task. Do not search unrelated projects,
  personal configuration, credentials, SSH keys, or keychains.
- Do not disclose or include tokens, signing material, or local SDK paths in
  source, documentation, reports, or artifacts.
- Do not publish, push, or manage remote issues, PRs, or repository/Project
  settings without explicit authorization. Never widen access to finish a task.
- Stop and report a missing input or permission; do not bypass restrictions.
