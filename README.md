# gradlemon

This is just an example for
https://stackoverflow.com/questions/44918632/can-gradle-restart-running-app-in-continuous-build-mode-run
and
https://discuss.gradle.org/t/how-to-restart-a-run-in-continuous-mode/23221/4

It'll be complete with a single PR: one that makes App restart on change.

## How to use

```bash
gradle run -d -t
```

Edit App.java during run, you'll see "Still running" from App alongside gradle detecting your change:
```
15:47:16.425 [null] [org.gradle.internal.progress.DefaultBuildOperationExecutor]
> Task :run
15:47:21.077 [QUIET] [system.out] Still running
15:47:21.505 [null] [org.gradle.internal.filewatch.jdk7.WatchServiceFileWatcherBacking]
15:47:21.505 [DEBUG] [org.gradle.internal.filewatch.jdk7.WatchServiceFileWatcherBacking] Received file system event: FileWatcherEvent{type=MODIFY, file=/Users/solsson/Reposoft/gradlemon/src/main/java/gradlemon/example/App.java}
15:47:21.506 [DEBUG] [org.gradle.internal.filewatch.jdk7.WatchServiceRegistrar] Calling onChange with event FileWatcherEvent{type=MODIFY, file=/Users/solsson/Reposoft/gradlemon/src/main/java/gradlemon/example/App.java}
```

The task is to trigger an app restart, like with for example https://nodemon.io/ in Node.js.
