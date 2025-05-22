package com.dreamsportslabs.guardian.registry;

import com.dreamsportslabs.guardian.config.tenant.TenantConfig;
import lombok.SneakyThrows;

public class RegistryInit {

  @SneakyThrows
  public static TenantConfig initializeRegistry(Registry registry, TenantConfig tenantConfig) {
    String tenantId = tenantConfig.getTenantId();
    registry.put(tenantId, tenantConfig);
//    registry.put(tenantId, getTokenSigner(tenantConfig.getTokenConfig()));
    return tenantConfig;
  }

}
