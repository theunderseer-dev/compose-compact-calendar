# Compose Compact Calendar

A lightweight, customizable calendar library for Compose Multiplatform,
designed to fit into existing screens on Android, iOS, and Desktop.

## Status

Early development. The repository currently contains the generated
multiplatform application scaffold. The calendar component and public API
are not implemented yet, and no library artifact has been published.

The first milestone is a compact weekly view: seven days, abbreviated
weekday labels, date numbers, and optional date selection. Custom day
content and styling will let applications adapt the component to their needs.

## Project structure

- `shared/`: generated shared UI and platform code; currently a sample scaffold.
- `androidApp/`: Android application host.
- `desktopApp/`: Desktop JVM application host.

The shared module declares iOS device and simulator ARM64 framework targets.
A separate publishable calendar module will be introduced during bootstrap.
Platform validation and the supported toolchain matrix are still pending.

## Local development

Open the project root in Android Studio with the Kotlin Multiplatform plugin
and let Gradle sync. Use the Gradle Wrapper included in the repository.
Android builds require an Android SDK; iOS builds require macOS and Xcode
with its initial setup completed.

Keep SDK paths in the local, untracked `local.properties` file.

```bash
# Build the Android sample.
./gradlew :androidApp:assembleDebug

# Launch the Desktop sample.
./gradlew :desktopApp:run
```

These are development commands for the generated scaffold, not a record of
completed verification. CI and quality checks will be added during bootstrap.

## Development and feedback

See [CONTRIBUTING.md](CONTRIBUTING.md) for development and verification guidance.
Report bugs and propose features through
[GitHub Issues](https://github.com/theunderseer-dev/compose-compact-calendar/issues).
Agent-assisted contributors can follow [AGENTS.md](AGENTS.md).

## Author

Built by [Yevhen Volboienko](https://www.linkedin.com/in/yevhen-volboienko/) — Senior Android Engineer.

## License

Copyright 2026 Yevhen Volboienko.

Licensed under the [Apache License, Version 2.0](LICENSE).
