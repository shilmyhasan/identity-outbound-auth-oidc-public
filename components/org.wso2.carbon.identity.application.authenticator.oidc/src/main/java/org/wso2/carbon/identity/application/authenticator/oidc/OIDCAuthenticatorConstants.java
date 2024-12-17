/*
 * Copyright (c) 2015-2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authenticator.oidc;

import java.util.regex.Pattern;

/**
 * This class holds the constants related to the OIDC authenticator.
 */
public class OIDCAuthenticatorConstants {

    public static final String STATE_PARAM = "state.param";
    public static final String ACCESS_TOKEN_PARAM = "accessToken";
    public static final String CODE_PARAM = "code.param";
    public static final String ID_TOKEN_PARAM = "idToken";
    public static final String SESSION_DATA_KEY_PARAM = "sessionDataKey";
    public static final String CLIENT_ID_PARAM = "clientId";
    public static final String REFRESH_TOKEN = "refresh_token";
    public static final String EXPIRES_IN = "expires_in";
    public static final String SHARE_FEDERATED_TOKEN_CONFIG = "ShareFederatedToken";
    public static final String SHARE_FEDERATED_TOKEN_PARAM = "share_federated_token";
    public static final String FEDERATED_TOKEN_ALLOWED_SCOPE = "FederatedTokenAllowedScope";
    public static final String FEDERATED_TOKEN_SCOPE = "federated_token_scope";

    private OIDCAuthenticatorConstants() {

    }

    public static final String AUTHENTICATOR_NAME = "OpenIDConnectAuthenticator";
    public static final String AUTHENTICATOR_FRIENDLY_NAME = "openidconnect";
    public static final String LOGIN_TYPE = "OIDC";

    public static final String OAUTH_OIDC_SCOPE = "openid";
    public static final String OAUTH2_GRANT_TYPE_CODE = "code";
    public static final String OAUTH2_PARAM_STATE = "state";
    public static final String OAUTH2_ERROR = "error";
    public static final String REDIRECT_URI = "redirect_uri";

    public static final String ACCESS_TOKEN = "access_token";
    public static final String ID_TOKEN = "id_token";

    public static final String CLIENT_ID = "ClientId";
    public static final String CLIENT_SECRET = "ClientSecret";
    public static final String OAUTH2_AUTHZ_URL = "OAuth2AuthzEPUrl";
    public static final String OAUTH2_TOKEN_URL = "OAuth2TokenEPUrl";
    public static final String IS_BASIC_AUTH_ENABLED = "IsBasicAuthEnabled";

    public static final String OIDC_QUERY_PARAM_MAP_PROPERTY_KEY = "oidc:param.map";

    public static final String HTTP_ORIGIN_HEADER = "Origin";

    public static final String POST_LOGOUT_REDIRECT_URI = "post_logout_redirect_uri";
    public static final String ID_TOKEN_HINT = "id_token_hint";

    public static final String AUTH_PARAM = "$authparam";
    public static final String DYNAMIC_AUTH_PARAMS_LOOKUP_REGEX = "\\$authparam\\{(\\w+)\\}";

    public static final String LOGOUT_TOKEN = "logout_token";
    public static final Pattern OIDC_BACKCHANNEL_LOGOUT_ENDPOINT_URL_PATTERN = Pattern.compile("(.*)/identity/oidc" +
            "/slo(.*)");
    public static final String OIDC_FEDERATION_NONCE = "oidc_federation_nonce";
    public static final String AUTHENTICATOR_OIDC = "authenticator.oidc";
    public static final String REDIRECT_URL_SUFFIX = "_redirect_url";
    public static final String STATE_PARAM_SUFFIX = "_state_param";
    public static final String SCOPE_PARAM_SUFFIX = "_scope_param";
    public static final String REDIRECTION_PROMPT = "REDIRECTION_PROMPT";
    public static final String SCOPE = "scope";
    public static final String QUESTION_SIGN = "\\?";
    public static final String AMPERSAND_SIGN = "&";
    public static final String EQUAL_SIGN = "=";

    /**
     * This class holds the constants related to authenticator configuration parameters.
     */
    
    public static final String PKCE_CODE_VERIFIER = "PKCE_CODE_VERIFIER";
    public static final String IS_PKCE_ENABLED = "IsPKCEEnabled";

    public class AuthenticatorConfParams {

        private AuthenticatorConfParams() {

        }

        public static final String DEFAULT_IDP_CONFIG = "DefaultIdPConfig";
    }

    /**
     * This class holds the constants related to IdP configuration parameters.
     */
    public class IdPConfParams {

        private IdPConfParams() {

        }

        public static final String CLIENT_ID = "ClientId";
        public static final String CLIENT_SECRET = "ClientSecret";
        public static final String AUTHORIZATION_EP = "AuthorizationEndPoint";
        public static final String TOKEN_EP = "TokenEndPoint";
        public static final String OIDC_LOGOUT_URL = "OIDCLogoutEPUrl";
        public static final String USER_INFO_EP = "UserInfoEndPoint";
    }

    /**
     * This class holds the constants related to claims.
     */
    public class Claim {

        private Claim() {

        }

        public static final String SUB = "sub";
        public static final String NAME = "name";
        public static final String GIVEN_NAME = "given_name";
        public static final String FAMILY_NAME = "family_name";
        public static final String MIDDLE_NAME = "middle_name";
        public static final String NICK_NAME = "nickname";
        public static final String PREFERED_USERNAME = "preferred_username";
        public static final String PROFILE = "profile";
        public static final String PICTURE = "picture";
        public static final String WEBSITE = "website";
        public static final String EMAIL = "email";
        public static final String EMAIL_VERIFIED = "email_verified";
        public static final String GENDER = "gender";
        public static final String BIRTH_DATE = "birthdate";
        public static final String ZONE_INFO = "zoneinfo";
        public static final String LOCALE = "locale";
        public static final String PHONE_NUMBER = "phone_number";
        public static final String PHONE_NUMBER_VERIFIED = "phone_number_verified";
        public static final String ADDRESS = "address";
        public static final String UPDATED_AT = "updated_at";
        // Logout token claims.
        public static final String SID = "sid";
        public static final String NONCE = "nonce";
        public static final String EVENTS = "events";
        public static final String BACKCHANNEL_LOGOUT_EVENT = "http://schemas.openid.net/event/backchannel-logout";
        public static final String BACKCHANNEL_LOGOUT_EVENT_CLAIM = "{}";
    }

    /**
     *  This class holds the constants related to Back Channel Logout.
     */
    public class BackchannelLogout {

        private BackchannelLogout() {

        }

        public static final String DEFAULT_IDP_NAME = "default";
        public static final String OIDC_IDP_ENTITY_ID = "IdPEntityId";

        public static final String ENABLE_IAT_VALIDATION = "enableIatValidation";
        public static final String IAT_VALIDITY_PERIOD = "iatValidityPeriod";

        public static final String LOGOUT_SUCCESS = "OIDC back-channel logout success.";
        public static final String LOGOUT_FAILURE_SERVER_ERROR = "OIDC Back-channel logout failed due to an internal " +
                "server error.";

        public static final long DEFAULT_IAT_VALIDITY_PERIOD = 15000;
    }

    /**
     * Constants related to log management.
     */
    public static class LogConstants {

        public static final String OUTBOUND_AUTH_OIDC_SERVICE = "outbound-auth-oidc";

        /**
         * Define action IDs for diagnostic logs.
         */
        public static class ActionIDs {

            public static final String PROCESS_AUTHENTICATION_RESPONSE = "process-outbound-auth-oidc-response";
            public static final String INITIATE_OUTBOUND_AUTH_REQUEST = "initiate-outbound-auth-oidc-request";
        }
    }

    public class Proxy {

        private Proxy() {

        }

        public class HTTP {

            public static final String PROXY_HOST = "http.proxyHost";
            public static final String PROXY_USERRNAME = "http.proxyUsername";
            public static final String PROXY_PASSWORD = "http.proxyPassword";
            public static final String PROXY_PORT = "http.proxyPort";
            public static final String DEFAULT_PROXY_PORT = "80";
            public static final String NON_PROXY_HOSTS = "http.nonProxyHosts";
            public static final String PROTOCOL = "http";
        }

        public class HTTPS {

            public static final String PROXY_HOST = "https.proxyHost";
            public static final String PROXY_USERRNAME = "https.proxyUsername";
            public static final String PROXY_PASSWORD = "https.proxyPassword";
            public static final String PROXY_PORT = "https.proxyPort";
            public static final String DEFAULT_PROXY_PORT = "443";
            public static final String NON_PROXY_HOSTS = "https.nonProxyHosts";
            public static final String PROTOCOL = "https";
        }

        public static final String trustStoreLocation = "Security.TrustStore.Location";
        public static final String trustStorePassword = "Security.TrustStore.Password";
        public static final String hostNameVerifierSysEnv = "httpclient.hostnameVerifier";
        public static final String ALLOW_ALL_HOSTNAME_VERIFIER = "AllowAll";
        public static final String STRICT_HOSTNAME_VERIFIER = "Strict";
        public static final String DEFAULT_HOSTNAME_VERIFIER = "DefaultAndLocalhost";
    }
}
