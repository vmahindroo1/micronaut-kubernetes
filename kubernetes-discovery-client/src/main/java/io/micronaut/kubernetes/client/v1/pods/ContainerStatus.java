/*
 * Copyright 2017-2019 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.kubernetes.client.v1.pods;

/**
 * Information about the running container.
 *
 * @author Álvaro Sánchez-Mariscal
 * @since 1.0.0
 */
public class ContainerStatus {

    private String name;
    private String image;

    /**
     * @return Container name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name container name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Container image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image container image
     */
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ContainerStatus{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
