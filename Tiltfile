SOURCE_IMAGE = 'akseutap5registry.azurecr.io/micropet-aipets-springboot-sources'
LOCAL_PATH = os.getenv("LOCAL_PATH", default='.')
NAMESPACE = 'micropets-dev'

allow_k8s_contexts('aks-eu-tap-5')

k8s_yaml(["config/aipets-config.yaml"])

k8s_custom_deploy(
    'aipets-springboot',
    apply_cmd="tanzu apps workload apply -f config/workload.yaml --live-update" +
               " --local-path " + LOCAL_PATH +
               " --source-image " + SOURCE_IMAGE +
               " --namespace " + NAMESPACE +
               " --yes >/dev/null" +
               " && kubectl get workload aipets-springboot --namespace " + NAMESPACE + " -o yaml",
    delete_cmd="tanzu apps workload delete -f config/workload.yaml --namespace " + NAMESPACE + " --yes",
    deps=['pom.xml', './target/classes'],
    container_selector='workload',
    live_update=[
      sync('./target/classes', '/workspace/BOOT-INF/classes')
    ]
)

k8s_resource('aipets-springboot', port_forwards=["8080:8080"], extra_pod_selectors=[{'serving.knative.dev/service': 'aipets-springboot'}]) 