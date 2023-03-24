# AIPets MicroService

Create a secret with your `open-ai` apiKey.

````
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
  apikey: xxxx-yyyy-zzzzz
  prompt: A photo of a cute sheep with wings as a bird
````


