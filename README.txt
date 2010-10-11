Shows example ways to build a project. For a TWU teaching course for the new grads. As part of an interactive workshop.

I assigng pre-reading before the class. Then I cold-call on students to discuss the reading. 

Reading #1: http://thedailywtf.com/Articles/The-Source-Control-Shingle.aspx

Questions:

    * (name to cold-call upon), please summarize what Mark and Dave did. (to coordinate work in the same codebase).
    * Who has done something like this?
    * Who has a horror story about this?
    * (name), what is missing in a source control system with the shingle system?
      (answers include: revision history, log messages, auditing per line / blame, branching, merging, integrated diff tools, the concept of patches).
    * (name), how can you improve upon Mark and Dave's situation?

Reading #2: http://www.martinfowler.com/articles/continuousIntegration.html
Questions:

    * (name), what is continuous integration? (look for the simplest way to describe it is a build loop, a while loop in a shell script)
    * (name), how does source control management relate to continuous integration?
    * (for the ambitious), what is the difference between continuous integration and continuous deployment?
    * (name), what are the principles you should follow do decide if I should check something into version control or not. Third party library dependencies? Jars? JVM's? Photoshop original psd's? (We're looking for: "In general you should store in source control everything you need to build anything, but nothing that you actually build", also use this point to explain that if you see things checked in that shouldn't be – fix it and commit! Maybe ask a few other people for a sanity check. But be empowered! Hint, hint, the actual project they'll start soon).
    * (name), what would you tell a client dev if he or she would only check in once or twice a week, justifying that it's "better to be careful, than to break the build."
    * (name), what does it mean to "break the build?" (ask more guided questions to get them to come up with the idea of staged pipelines – i.e compilation and unit tests, then automated deployment, then functional tests, etc. Is it the same if we break the build in each of the stages?)
    * (name), what is a nightly build?
    * (name), what do lava lamps and a 'build radiator' have to do with continuous integration?
    * (name), what are the benefits of continuous integration? (reduced risk, reduced waste, faster deployments, fewer bugs, binary search on broken builds)
    * (name), how is this related to TDD, or testing? (well, without tests, the build is minimal, just showing you can compile, deploy, and start the app)
    * (name), what benefits does the business get with CI and continuous (or more frequent) deployment? (looking to say it gets stuff to users faster, and then you can look at actual usage, and from there determine what to build next)
    * (name), what are steps for CI? (1. automate build, 2. use SCM, 3. automated testing, 4. speed up build, etc.)

Bonus: describe continuous deployment

    * basically looking for 5 min build to production cycles, automated rollbacks, and canary subsets of users to identify problems early on.
