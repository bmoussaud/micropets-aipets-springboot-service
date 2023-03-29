# AIPets MicroService

Create a secret with your `open-ai` apiKey.

````
---
apiVersion: v1
kind: Secret
metadata:
  name: aipets-config
  labels:
    app.kubernetes.io/name: aipets
    app.kubernetes.io/part-of: micropets
type: Opaque
stringData:
  type: openai  
  #apikey:  xxx-yyy-zzzz or use exteral secrets below
---
apiVersion: v1
kind: Secret
metadata:
  name: app-aipets-config
  labels:
    app.kubernetes.io/name: aipets
    app.kubernetes.io/part-of: micropets
type: Opaque
stringData:
  type: app-config
  items: "4"
  prompt: A photo of a cute pig with on the wing
````


