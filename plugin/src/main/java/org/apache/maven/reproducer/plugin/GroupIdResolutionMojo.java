package org.apache.maven.reproducer.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

/**
 */
@Mojo(name = "hello", requiresDependencyResolution = ResolutionScope.NONE, defaultPhase = LifecyclePhase.VALIDATE)
public class GroupIdResolutionMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello from 0.0.1-SNAPSHOT");
    }
}