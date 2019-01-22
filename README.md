# AprilTag-Generation

Generate AprilTags in custom layouts for [AprilTag 3](https://github.com/AprilRobotics/apriltag-generation).

## NRMC Usage
### Generate tag16h6 family
```
ant
java -cp april.jar april.tag.TagFamilyGenerator classic_8 6
```
### Generate C files and Tags
```
ant
java -cp april.jar april.tag.TagToC april.tag.Tag16h6
java -cp april.jar april.tag.GenerateTags april.tag.Tag16h6 build/Tag16h6
```


## Original Example Usage
Example usage for generating the 21h7 circular tag family:
```
$ ant
$ java -cp april.jar april.tag.TagFamilyGenerator circle_9 7
```
Then to generate the c code and tag images after copying the output into the source folder:
```
$ ant
$ java -cp april.jar april.tag.TagToC april.tag.TagCircle21h7
$ java -cp april.jar april.tag.GenerateTags april.tag.TagCircle21h7 .
```
