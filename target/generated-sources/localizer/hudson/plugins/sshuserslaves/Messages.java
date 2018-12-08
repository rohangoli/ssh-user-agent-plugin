// CHECKSTYLE:OFF

package hudson.plugins.sshuserslaves;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;
import org.kohsuke.accmod.Restricted;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
@Restricted(org.kohsuke.accmod.restrictions.NoExternalUse.class)
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code
     * ManualKeyProvidedHostKeyVerifier.Base64EncodedKeyValueRequired}:
     * {@code The value part of the key should be a Base64 encoded value.}.
     * 
     * @return
     *     {@code The value part of the key should be a Base64 encoded value.}
     */
    public static String ManualKeyProvidedHostKeyVerifier_Base64EncodedKeyValueRequired() {
        return holder.format("ManualKeyProvidedHostKeyVerifier.Base64EncodedKeyValueRequired");
    }

    /**
     * Key {@code
     * ManualKeyProvidedHostKeyVerifier.Base64EncodedKeyValueRequired}:
     * {@code The value part of the key should be a Base64 encoded value.}.
     * 
     * @return
     *     {@code The value part of the key should be a Base64 encoded value.}
     */
    public static Localizable _ManualKeyProvidedHostKeyVerifier_Base64EncodedKeyValueRequired() {
        return new Localizable(holder, "ManualKeyProvidedHostKeyVerifier.Base64EncodedKeyValueRequired");
    }

    /**
     * Key {@code SSHLauncher.RemoteFSIsAFile}: {@code Remote file system
     * root {0} is a file not a directory or a symlink.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Remote file system root {0} is a file not a directory or a
     *     symlink.}
     */
    public static String SSHLauncher_RemoteFSIsAFile(Object arg0) {
        return holder.format("SSHLauncher.RemoteFSIsAFile", arg0);
    }

    /**
     * Key {@code SSHLauncher.RemoteFSIsAFile}: {@code Remote file system
     * root {0} is a file not a directory or a symlink.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Remote file system root {0} is a file not a directory or a
     *     symlink.}
     */
    public static Localizable _SSHLauncher_RemoteFSIsAFile(Object arg0) {
        return new Localizable(holder, "SSHLauncher.RemoteFSIsAFile", arg0);
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.KeyTrusted}: {@code {0} [SSH]
     * SSH host key matches key in Known Hosts file. Connection will be
     * allowed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] SSH host key matches key in Known Hosts file.
     *     Connection will be allowed.}
     */
    public static String KnownHostsFileHostKeyVerifier_KeyTrusted(Object arg0) {
        return holder.format("KnownHostsFileHostKeyVerifier.KeyTrusted", arg0);
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.KeyTrusted}: {@code {0} [SSH]
     * SSH host key matches key in Known Hosts file. Connection will be
     * allowed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] SSH host key matches key in Known Hosts file.
     *     Connection will be allowed.}
     */
    public static Localizable _KnownHostsFileHostKeyVerifier_KeyTrusted(Object arg0) {
        return new Localizable(holder, "KnownHostsFileHostKeyVerifier.KeyTrusted", arg0);
    }

    /**
     * Key {@code SSHLauncher.PortLessThanZero}: {@code The port value must
     * be greater than 0}.
     * 
     * @return
     *     {@code The port value must be greater than 0}
     */
    public static String SSHLauncher_PortLessThanZero() {
        return holder.format("SSHLauncher.PortLessThanZero");
    }

    /**
     * Key {@code SSHLauncher.PortLessThanZero}: {@code The port value must
     * be greater than 0}.
     * 
     * @return
     *     {@code The port value must be greater than 0}
     */
    public static Localizable _SSHLauncher_PortLessThanZero() {
        return new Localizable(holder, "SSHLauncher.PortLessThanZero");
    }

    /**
     * Key {@code TrustHostKeyAction.DisplayName}: {@code Trust SSH Host
     * Key}.
     * 
     * @return
     *     {@code Trust SSH Host Key}
     */
    public static String TrustHostKeyAction_DisplayName() {
        return holder.format("TrustHostKeyAction.DisplayName");
    }

    /**
     * Key {@code TrustHostKeyAction.DisplayName}: {@code Trust SSH Host
     * Key}.
     * 
     * @return
     *     {@code Trust SSH Host Key}
     */
    public static Localizable _TrustHostKeyAction_DisplayName() {
        return new Localizable(holder, "TrustHostKeyAction.DisplayName");
    }

    /**
     * Key {@code SSHLauncher.AuthenticationSuccessful}: {@code {0} [SSH]
     * Authentication successful.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Authentication successful.}
     */
    public static String SSHLauncher_AuthenticationSuccessful(Object arg0) {
        return holder.format("SSHLauncher.AuthenticationSuccessful", arg0);
    }

    /**
     * Key {@code SSHLauncher.AuthenticationSuccessful}: {@code {0} [SSH]
     * Authentication successful.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Authentication successful.}
     */
    public static Localizable _SSHLauncher_AuthenticationSuccessful(Object arg0) {
        return new Localizable(holder, "SSHLauncher.AuthenticationSuccessful", arg0);
    }

    /**
     * Key {@code NonVerifyingHostKeyVerifier.DescriptorDisplayName}: {@code
     * Non verifying Verification Strategy}.
     * 
     * @return
     *     {@code Non verifying Verification Strategy}
     */
    public static String NonVerifyingHostKeyVerifier_DescriptorDisplayName() {
        return holder.format("NonVerifyingHostKeyVerifier.DescriptorDisplayName");
    }

    /**
     * Key {@code NonVerifyingHostKeyVerifier.DescriptorDisplayName}: {@code
     * Non verifying Verification Strategy}.
     * 
     * @return
     *     {@code Non verifying Verification Strategy}
     */
    public static Localizable _NonVerifyingHostKeyVerifier_DescriptorDisplayName() {
        return new Localizable(holder, "NonVerifyingHostKeyVerifier.DescriptorDisplayName");
    }

    /**
     * Key {@code SSHLauncher.StartingSCPClient}: {@code {0} [SSH] SFTP
     * failed. Copying via SCP.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] SFTP failed. Copying via SCP.}
     */
    public static String SSHLauncher_StartingSCPClient(Object arg0) {
        return holder.format("SSHLauncher.StartingSCPClient", arg0);
    }

    /**
     * Key {@code SSHLauncher.StartingSCPClient}: {@code {0} [SSH] SFTP
     * failed. Copying via SCP.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] SFTP failed. Copying via SCP.}
     */
    public static Localizable _SSHLauncher_StartingSCPClient(Object arg0) {
        return new Localizable(holder, "SSHLauncher.StartingSCPClient", arg0);
    }

    /**
     * Key {@code SSHLauncher.AuthenticationFailedException}: {@code
     * Authentication failed.}.
     * 
     * @return
     *     {@code Authentication failed.}
     */
    public static String SSHLauncher_AuthenticationFailedException() {
        return holder.format("SSHLauncher.AuthenticationFailedException");
    }

    /**
     * Key {@code SSHLauncher.AuthenticationFailedException}: {@code
     * Authentication failed.}.
     * 
     * @return
     *     {@code Authentication failed.}
     */
    public static Localizable _SSHLauncher_AuthenticationFailedException() {
        return new Localizable(holder, "SSHLauncher.AuthenticationFailedException");
    }

    /**
     * Key {@code SSHLauncher.AuthenticationFailed}: {@code {0} [SSH]
     * Authentication failed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Authentication failed.}
     */
    public static String SSHLauncher_AuthenticationFailed(Object arg0) {
        return holder.format("SSHLauncher.AuthenticationFailed", arg0);
    }

    /**
     * Key {@code SSHLauncher.AuthenticationFailed}: {@code {0} [SSH]
     * Authentication failed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Authentication failed.}
     */
    public static Localizable _SSHLauncher_AuthenticationFailed(Object arg0) {
        return new Localizable(holder, "SSHLauncher.AuthenticationFailed", arg0);
    }

    /**
     * Key {@code SSHLauncher.StartingSFTPClient}: {@code {0} [SSH] Starting
     * sftp client.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Starting sftp client.}
     */
    public static String SSHLauncher_StartingSFTPClient(Object arg0) {
        return holder.format("SSHLauncher.StartingSFTPClient", arg0);
    }

    /**
     * Key {@code SSHLauncher.StartingSFTPClient}: {@code {0} [SSH] Starting
     * sftp client.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Starting sftp client.}
     */
    public static Localizable _SSHLauncher_StartingSFTPClient(Object arg0) {
        return new Localizable(holder, "SSHLauncher.StartingSFTPClient", arg0);
    }

    /**
     * Key {@code SSHLauncher.LaunchCompletedDuration}: {@code {0} SSH Launch
     * of {1} on {2} completed in {3} ms}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} SSH Launch of {1} on {2} completed in {3} ms}
     */
    public static String SSHLauncher_LaunchCompletedDuration(Object arg0, Object arg1, Object arg2, Object arg3) {
        return holder.format("SSHLauncher.LaunchCompletedDuration", arg0, arg1, arg2, arg3);
    }

    /**
     * Key {@code SSHLauncher.LaunchCompletedDuration}: {@code {0} SSH Launch
     * of {1} on {2} completed in {3} ms}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} SSH Launch of {1} on {2} completed in {3} ms}
     */
    public static Localizable _SSHLauncher_LaunchCompletedDuration(Object arg0, Object arg1, Object arg2, Object arg3) {
        return new Localizable(holder, "SSHLauncher.LaunchCompletedDuration", arg0, arg1, arg2, arg3);
    }

    /**
     * Key {@code SSHLauncher.CopiedXXXBytes}: {@code {0} [SSH] Copied {1}
     * bytes.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Copied {1} bytes.}
     */
    public static String SSHLauncher_CopiedXXXBytes(Object arg0, Object arg1) {
        return holder.format("SSHLauncher.CopiedXXXBytes", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.CopiedXXXBytes}: {@code {0} [SSH] Copied {1}
     * bytes.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Copied {1} bytes.}
     */
    public static Localizable _SSHLauncher_CopiedXXXBytes(Object arg0, Object arg1) {
        return new Localizable(holder, "SSHLauncher.CopiedXXXBytes", arg0, arg1);
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.NoKnownHostsFile}: {@code {0}
     * [SSH] No Known Hosts file was found at {0}. Please ensure one is
     * created at this path and that Jenkins can read it.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] No Known Hosts file was found at {0}. Please ensure
     *     one is created at this path and that Jenkins can read it.}
     */
    public static String KnownHostsFileHostKeyVerifier_NoKnownHostsFile(Object arg0) {
        return holder.format("KnownHostsFileHostKeyVerifier.NoKnownHostsFile", arg0);
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.NoKnownHostsFile}: {@code {0}
     * [SSH] No Known Hosts file was found at {0}. Please ensure one is
     * created at this path and that Jenkins can read it.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] No Known Hosts file was found at {0}. Please ensure
     *     one is created at this path and that Jenkins can read it.}
     */
    public static Localizable _KnownHostsFileHostKeyVerifier_NoKnownHostsFile(Object arg0) {
        return new Localizable(holder, "KnownHostsFileHostKeyVerifier.NoKnownHostsFile", arg0);
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.KeyTrusted}: {@code {0}
     * [SSH] SSH host key matched the key required for this connection.
     * Connection will be allowed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] SSH host key matched the key required for this
     *     connection. Connection will be allowed.}
     */
    public static String ManualKeyProvidedHostKeyVerifier_KeyTrusted(Object arg0) {
        return holder.format("ManualKeyProvidedHostKeyVerifier.KeyTrusted", arg0);
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.KeyTrusted}: {@code {0}
     * [SSH] SSH host key matched the key required for this connection.
     * Connection will be allowed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] SSH host key matched the key required for this
     *     connection. Connection will be allowed.}
     */
    public static Localizable _ManualKeyProvidedHostKeyVerifier_KeyTrusted(Object arg0) {
        return new Localizable(holder, "ManualKeyProvidedHostKeyVerifier.KeyTrusted", arg0);
    }

    /**
     * Key {@code ManualTrustingHostKeyVerifier.KeyTrusted}: {@code {0} [SSH]
     * SSH host key matches key seen previously for this host. Connection
     * will be allowed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] SSH host key matches key seen previously for this
     *     host. Connection will be allowed.}
     */
    public static String ManualTrustingHostKeyVerifier_KeyTrusted(Object arg0) {
        return holder.format("ManualTrustingHostKeyVerifier.KeyTrusted", arg0);
    }

    /**
     * Key {@code ManualTrustingHostKeyVerifier.KeyTrusted}: {@code {0} [SSH]
     * SSH host key matches key seen previously for this host. Connection
     * will be allowed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] SSH host key matches key seen previously for this
     *     host. Connection will be allowed.}
     */
    public static Localizable _ManualTrustingHostKeyVerifier_KeyTrusted(Object arg0) {
        return new Localizable(holder, "ManualTrustingHostKeyVerifier.KeyTrusted", arg0);
    }

    /**
     * Key {@code ManualTrustingHostKeyVerifier.KeyAutoTrusted}: {@code {0}
     * [SSH] The SSH key with fingerprint {1} has been automatically trusted
     * for connections to this machine.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] The SSH key with fingerprint {1} has been
     *     automatically trusted for connections to this machine.}
     */
    public static String ManualTrustingHostKeyVerifier_KeyAutoTrusted(Object arg0, Object arg1) {
        return holder.format("ManualTrustingHostKeyVerifier.KeyAutoTrusted", arg0, arg1);
    }

    /**
     * Key {@code ManualTrustingHostKeyVerifier.KeyAutoTrusted}: {@code {0}
     * [SSH] The SSH key with fingerprint {1} has been automatically trusted
     * for connections to this machine.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] The SSH key with fingerprint {1} has been
     *     automatically trusted for connections to this machine.}
     */
    public static Localizable _ManualTrustingHostKeyVerifier_KeyAutoTrusted(Object arg0, Object arg1) {
        return new Localizable(holder, "ManualTrustingHostKeyVerifier.KeyAutoTrusted", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.AbortedDuringConnectionOpen}: {@code Agent
     * start aborted.}.
     * 
     * @return
     *     {@code Agent start aborted.}
     */
    public static String SSHLauncher_AbortedDuringConnectionOpen() {
        return holder.format("SSHLauncher.AbortedDuringConnectionOpen");
    }

    /**
     * Key {@code SSHLauncher.AbortedDuringConnectionOpen}: {@code Agent
     * start aborted.}.
     * 
     * @return
     *     {@code Agent start aborted.}
     */
    public static Localizable _SSHLauncher_AbortedDuringConnectionOpen() {
        return new Localizable(holder, "SSHLauncher.AbortedDuringConnectionOpen");
    }

    /**
     * Key {@code SSHLauncher.NoPrivateKey}: {@code {0} [SSH] Private key
     * file "{1}" doesn''t exist. Skipping public key authentication.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Private key file "{1}" doesn''t exist. Skipping
     *     public key authentication.}
     */
    public static String SSHLauncher_NoPrivateKey(Object arg0, Object arg1) {
        return holder.format("SSHLauncher.NoPrivateKey", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.NoPrivateKey}: {@code {0} [SSH] Private key
     * file "{1}" doesn''t exist. Skipping public key authentication.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Private key file "{1}" doesn''t exist. Skipping
     *     public key authentication.}
     */
    public static Localizable _SSHLauncher_NoPrivateKey(Object arg0, Object arg1) {
        return new Localizable(holder, "SSHLauncher.NoPrivateKey", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.ErrorDeletingFile}: {@code {0} [SSH] Error
     * deleting file.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Error deleting file.}
     */
    public static String SSHLauncher_ErrorDeletingFile(Object arg0) {
        return holder.format("SSHLauncher.ErrorDeletingFile", arg0);
    }

    /**
     * Key {@code SSHLauncher.ErrorDeletingFile}: {@code {0} [SSH] Error
     * deleting file.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Error deleting file.}
     */
    public static Localizable _SSHLauncher_ErrorDeletingFile(Object arg0) {
        return new Localizable(holder, "SSHLauncher.ErrorDeletingFile", arg0);
    }

    /**
     * Key {@code SSHLauncher.AuthenticatingPublicKey}: {@code {0} [SSH]
     * Authenticating as {1} with {2}.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Authenticating as {1} with {2}.}
     */
    public static String SSHLauncher_AuthenticatingPublicKey(Object arg0, Object arg1, Object arg2) {
        return holder.format("SSHLauncher.AuthenticatingPublicKey", arg0, arg1, arg2);
    }

    /**
     * Key {@code SSHLauncher.AuthenticatingPublicKey}: {@code {0} [SSH]
     * Authenticating as {1} with {2}.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Authenticating as {1} with {2}.}
     */
    public static Localizable _SSHLauncher_AuthenticatingPublicKey(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "SSHLauncher.AuthenticatingPublicKey", arg0, arg1, arg2);
    }

    /**
     * Key {@code ManualTrustingHostKeyVerifier.KeyNotTrusted}: {@code {0}
     * [SSH] WARNING: The SSH key for this host is not currently trusted.
     * Connections will be denied until this new key is authorised.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] WARNING: The SSH key for this host is not currently
     *     trusted. Connections will be denied until this new key is authorised.}
     */
    public static String ManualTrustingHostKeyVerifier_KeyNotTrusted(Object arg0) {
        return holder.format("ManualTrustingHostKeyVerifier.KeyNotTrusted", arg0);
    }

    /**
     * Key {@code ManualTrustingHostKeyVerifier.KeyNotTrusted}: {@code {0}
     * [SSH] WARNING: The SSH key for this host is not currently trusted.
     * Connections will be denied until this new key is authorised.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] WARNING: The SSH key for this host is not currently
     *     trusted. Connections will be denied until this new key is authorised.}
     */
    public static Localizable _ManualTrustingHostKeyVerifier_KeyNotTrusted(Object arg0) {
        return new Localizable(holder, "ManualTrustingHostKeyVerifier.KeyNotTrusted", arg0);
    }

    /**
     * Key {@code SSHLauncher.SSHHeaderJunkDetected}: {@code SSH connection
     * reports a garbage before a command execution.
     * Check your .bashrc,
     * .profile, and so on to make sure it is quiet.
     * The received junk text
     * is as follows:}.
     * 
     * @return
     *     {@code SSH connection reports a garbage before a command
     *     execution.
     *     Check your .bashrc, .profile, and so on to make sure it is
     *     quiet.
     *     The received junk text is as follows:}
     */
    public static String SSHLauncher_SSHHeaderJunkDetected() {
        return holder.format("SSHLauncher.SSHHeaderJunkDetected");
    }

    /**
     * Key {@code SSHLauncher.SSHHeaderJunkDetected}: {@code SSH connection
     * reports a garbage before a command execution.
     * Check your .bashrc,
     * .profile, and so on to make sure it is quiet.
     * The received junk text
     * is as follows:}.
     * 
     * @return
     *     {@code SSH connection reports a garbage before a command
     *     execution.
     *     Check your .bashrc, .profile, and so on to make sure it is
     *     quiet.
     *     The received junk text is as follows:}
     */
    public static Localizable _SSHLauncher_SSHHeaderJunkDetected() {
        return new Localizable(holder, "SSHLauncher.SSHHeaderJunkDetected");
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.NewKeyNotTrusted}: {@code {0}
     * [SSH] WARNING: No entry currently exists in the Known Hosts file for
     * this host. Connections will be denied until this new host and its
     * associated key is added to the Known Hosts file.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] WARNING: No entry currently exists in the Known Hosts
     *     file for this host. Connections will be denied until this new host and
     *     its associated key is added to the Known Hosts file.}
     */
    public static String KnownHostsFileHostKeyVerifier_NewKeyNotTrusted(Object arg0) {
        return holder.format("KnownHostsFileHostKeyVerifier.NewKeyNotTrusted", arg0);
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.NewKeyNotTrusted}: {@code {0}
     * [SSH] WARNING: No entry currently exists in the Known Hosts file for
     * this host. Connections will be denied until this new host and its
     * associated key is added to the Known Hosts file.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] WARNING: No entry currently exists in the Known Hosts
     *     file for this host. Connections will be denied until this new host and
     *     its associated key is added to the Known Hosts file.}
     */
    public static Localizable _KnownHostsFileHostKeyVerifier_NewKeyNotTrusted(Object arg0) {
        return new Localizable(holder, "KnownHostsFileHostKeyVerifier.NewKeyNotTrusted", arg0);
    }

    /**
     * Key {@code SSHLauncher.ErrorWhileClosingConnection}: {@code Exception
     * thrown while closing connection.}.
     * 
     * @return
     *     {@code Exception thrown while closing connection.}
     */
    public static String SSHLauncher_ErrorWhileClosingConnection() {
        return holder.format("SSHLauncher.ErrorWhileClosingConnection");
    }

    /**
     * Key {@code SSHLauncher.ErrorWhileClosingConnection}: {@code Exception
     * thrown while closing connection.}.
     * 
     * @return
     *     {@code Exception thrown while closing connection.}
     */
    public static Localizable _SSHLauncher_ErrorWhileClosingConnection() {
        return new Localizable(holder, "SSHLauncher.ErrorWhileClosingConnection");
    }

    /**
     * Key {@code SSHLauncher.ErrorCopyingAgentJarTo}: {@code Could not copy
     * remoting.jar to ''{0}'' on agent}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Could not copy remoting.jar to ''{0}'' on agent}
     */
    public static String SSHLauncher_ErrorCopyingAgentJarTo(Object arg0) {
        return holder.format("SSHLauncher.ErrorCopyingAgentJarTo", arg0);
    }

    /**
     * Key {@code SSHLauncher.ErrorCopyingAgentJarTo}: {@code Could not copy
     * remoting.jar to ''{0}'' on agent}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Could not copy remoting.jar to ''{0}'' on agent}
     */
    public static Localizable _SSHLauncher_ErrorCopyingAgentJarTo(Object arg0) {
        return new Localizable(holder, "SSHLauncher.ErrorCopyingAgentJarTo", arg0);
    }

    /**
     * Key {@code ManualTrustingHostKeyVerifier.DescriptorDisplayName}:
     * {@code Manually trusted key Verification Strategy}.
     * 
     * @return
     *     {@code Manually trusted key Verification Strategy}
     */
    public static String ManualTrustingHostKeyVerifier_DescriptorDisplayName() {
        return holder.format("ManualTrustingHostKeyVerifier.DescriptorDisplayName");
    }

    /**
     * Key {@code ManualTrustingHostKeyVerifier.DescriptorDisplayName}:
     * {@code Manually trusted key Verification Strategy}.
     * 
     * @return
     *     {@code Manually trusted key Verification Strategy}
     */
    public static Localizable _ManualTrustingHostKeyVerifier_DescriptorDisplayName() {
        return new Localizable(holder, "ManualTrustingHostKeyVerifier.DescriptorDisplayName");
    }

    /**
     * Key {@code SSHLauncher.LaunchFailedDuration}: {@code {0} SSH Launch of
     * {1} on {2} failed in {3} ms}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} SSH Launch of {1} on {2} failed in {3} ms}
     */
    public static String SSHLauncher_LaunchFailedDuration(Object arg0, Object arg1, Object arg2, Object arg3) {
        return holder.format("SSHLauncher.LaunchFailedDuration", arg0, arg1, arg2, arg3);
    }

    /**
     * Key {@code SSHLauncher.LaunchFailedDuration}: {@code {0} SSH Launch of
     * {1} on {2} failed in {3} ms}.
     * 
     * @param arg3
     *      4th format parameter, {@code {3}}, as {@link String#valueOf(Object)}.
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} SSH Launch of {1} on {2} failed in {3} ms}
     */
    public static Localizable _SSHLauncher_LaunchFailedDuration(Object arg0, Object arg1, Object arg2, Object arg3) {
        return new Localizable(holder, "SSHLauncher.LaunchFailedDuration", arg0, arg1, arg2, arg3);
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.UnknownKeyAlgorithm}:
     * {@code Key algorithm should be one of ssh-rsa or ssh-dss.}.
     * 
     * @return
     *     {@code Key algorithm should be one of ssh-rsa or ssh-dss.}
     */
    public static String ManualKeyProvidedHostKeyVerifier_UnknownKeyAlgorithm() {
        return holder.format("ManualKeyProvidedHostKeyVerifier.UnknownKeyAlgorithm");
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.UnknownKeyAlgorithm}:
     * {@code Key algorithm should be one of ssh-rsa or ssh-dss.}.
     * 
     * @return
     *     {@code Key algorithm should be one of ssh-rsa or ssh-dss.}
     */
    public static Localizable _ManualKeyProvidedHostKeyVerifier_UnknownKeyAlgorithm() {
        return new Localizable(holder, "ManualKeyProvidedHostKeyVerifier.UnknownKeyAlgorithm");
    }

    /**
     * Key {@code SSHLauncher.DescriptorDisplayName}: {@code Launch user
     * specific agents via SSH}.
     * 
     * @return
     *     {@code Launch user specific agents via SSH}
     */
    public static String SSHLauncher_DescriptorDisplayName() {
        return holder.format("SSHLauncher.DescriptorDisplayName");
    }

    /**
     * Key {@code SSHLauncher.DescriptorDisplayName}: {@code Launch user
     * specific agents via SSH}.
     * 
     * @return
     *     {@code Launch user specific agents via SSH}
     */
    public static Localizable _SSHLauncher_DescriptorDisplayName() {
        return new Localizable(holder, "SSHLauncher.DescriptorDisplayName");
    }

    /**
     * Key {@code SSHConnector.LaunchTimeoutMustBeANumber}: {@code The launch
     * timeout must be a number.}.
     * 
     * @return
     *     {@code The launch timeout must be a number.}
     */
    public static String SSHConnector_LaunchTimeoutMustBeANumber() {
        return holder.format("SSHConnector.LaunchTimeoutMustBeANumber");
    }

    /**
     * Key {@code SSHConnector.LaunchTimeoutMustBeANumber}: {@code The launch
     * timeout must be a number.}.
     * 
     * @return
     *     {@code The launch timeout must be a number.}
     */
    public static Localizable _SSHConnector_LaunchTimeoutMustBeANumber() {
        return new Localizable(holder, "SSHConnector.LaunchTimeoutMustBeANumber");
    }

    /**
     * Key {@code SSHLauncher.PortMoreThan65535}: {@code The port value must
     * be less than 65536}.
     * 
     * @return
     *     {@code The port value must be less than 65536}
     */
    public static String SSHLauncher_PortMoreThan65535() {
        return holder.format("SSHLauncher.PortMoreThan65535");
    }

    /**
     * Key {@code SSHLauncher.PortMoreThan65535}: {@code The port value must
     * be less than 65536}.
     * 
     * @return
     *     {@code The port value must be less than 65536}
     */
    public static Localizable _SSHLauncher_PortMoreThan65535() {
        return new Localizable(holder, "SSHLauncher.PortMoreThan65535");
    }

    /**
     * Key {@code SSHLauncher.PortNotSpecified}: {@code The port must be
     * specified}.
     * 
     * @return
     *     {@code The port must be specified}
     */
    public static String SSHLauncher_PortNotSpecified() {
        return holder.format("SSHLauncher.PortNotSpecified");
    }

    /**
     * Key {@code SSHLauncher.PortNotSpecified}: {@code The port must be
     * specified}.
     * 
     * @return
     *     {@code The port must be specified}
     */
    public static Localizable _SSHLauncher_PortNotSpecified() {
        return new Localizable(holder, "SSHLauncher.PortNotSpecified");
    }

    /**
     * Key {@code SSHLauncher.OpeningSSHConnection}: {@code {0} [SSH] Opening
     * SSH connection to {1}.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Opening SSH connection to {1}.}
     */
    public static String SSHLauncher_OpeningSSHConnection(Object arg0, Object arg1) {
        return holder.format("SSHLauncher.OpeningSSHConnection", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.OpeningSSHConnection}: {@code {0} [SSH] Opening
     * SSH connection to {1}.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Opening SSH connection to {1}.}
     */
    public static Localizable _SSHLauncher_OpeningSSHConnection(Object arg0, Object arg1) {
        return new Localizable(holder, "SSHLauncher.OpeningSSHConnection", arg0, arg1);
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.DisplayName}: {@code
     * Manually provided key Verification Strategy}.
     * 
     * @return
     *     {@code Manually provided key Verification Strategy}
     */
    public static String ManualKeyProvidedHostKeyVerifier_DisplayName() {
        return holder.format("ManualKeyProvidedHostKeyVerifier.DisplayName");
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.DisplayName}: {@code
     * Manually provided key Verification Strategy}.
     * 
     * @return
     *     {@code Manually provided key Verification Strategy}
     */
    public static Localizable _ManualKeyProvidedHostKeyVerifier_DisplayName() {
        return new Localizable(holder, "ManualKeyProvidedHostKeyVerifier.DisplayName");
    }

    /**
     * Key {@code SSHLauncher.SelectedCredentialsMissing}: {@code The
     * selected credentials cannot be found}.
     * 
     * @return
     *     {@code The selected credentials cannot be found}
     */
    public static String SSHLauncher_SelectedCredentialsMissing() {
        return holder.format("SSHLauncher.SelectedCredentialsMissing");
    }

    /**
     * Key {@code SSHLauncher.SelectedCredentialsMissing}: {@code The
     * selected credentials cannot be found}.
     * 
     * @return
     *     {@code The selected credentials cannot be found}
     */
    public static Localizable _SSHLauncher_SelectedCredentialsMissing() {
        return new Localizable(holder, "SSHLauncher.SelectedCredentialsMissing");
    }

    /**
     * Key {@code SSHLauncher.ConnectionClosed}: {@code {0} [SSH] Connection
     * closed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Connection closed.}
     */
    public static String SSHLauncher_ConnectionClosed(Object arg0) {
        return holder.format("SSHLauncher.ConnectionClosed", arg0);
    }

    /**
     * Key {@code SSHLauncher.ConnectionClosed}: {@code {0} [SSH] Connection
     * closed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Connection closed.}
     */
    public static Localizable _SSHLauncher_ConnectionClosed(Object arg0) {
        return new Localizable(holder, "SSHLauncher.ConnectionClosed", arg0);
    }

    /**
     * Key {@code SSHLauncher.RemoteFSDoesNotExist}: {@code {0} [SSH] Remote
     * file system root {1} does not exist. Will try to create it...}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Remote file system root {1} does not exist. Will try
     *     to create it...}
     */
    public static String SSHLauncher_RemoteFSDoesNotExist(Object arg0, Object arg1) {
        return holder.format("SSHLauncher.RemoteFSDoesNotExist", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.RemoteFSDoesNotExist}: {@code {0} [SSH] Remote
     * file system root {1} does not exist. Will try to create it...}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Remote file system root {1} does not exist. Will try
     *     to create it...}
     */
    public static Localizable _SSHLauncher_RemoteFSDoesNotExist(Object arg0, Object arg1) {
        return new Localizable(holder, "SSHLauncher.RemoteFSDoesNotExist", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.ErrorCopyingAgentJarInto}: {@code Could not
     * copy remoting.jar into ''{0}'' on agent}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Could not copy remoting.jar into ''{0}'' on agent}
     */
    public static String SSHLauncher_ErrorCopyingAgentJarInto(Object arg0) {
        return holder.format("SSHLauncher.ErrorCopyingAgentJarInto", arg0);
    }

    /**
     * Key {@code SSHLauncher.ErrorCopyingAgentJarInto}: {@code Could not
     * copy remoting.jar into ''{0}'' on agent}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Could not copy remoting.jar into ''{0}'' on agent}
     */
    public static Localizable _SSHLauncher_ErrorCopyingAgentJarInto(Object arg0) {
        return new Localizable(holder, "SSHLauncher.ErrorCopyingAgentJarInto", arg0);
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.KeyValueDoesNotParse}:
     * {@code Key value does not parse into a valid {0} key}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Key value does not parse into a valid {0} key}
     */
    public static String ManualKeyProvidedHostKeyVerifier_KeyValueDoesNotParse(Object arg0) {
        return holder.format("ManualKeyProvidedHostKeyVerifier.KeyValueDoesNotParse", arg0);
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.KeyValueDoesNotParse}:
     * {@code Key value does not parse into a valid {0} key}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Key value does not parse into a valid {0} key}
     */
    public static Localizable _ManualKeyProvidedHostKeyVerifier_KeyValueDoesNotParse(Object arg0) {
        return new Localizable(holder, "ManualKeyProvidedHostKeyVerifier.KeyValueDoesNotParse", arg0);
    }

    /**
     * Key {@code SSHLauncher.PortNotANumber}: {@code Cannot parse the port}.
     * 
     * @return
     *     {@code Cannot parse the port}
     */
    public static String SSHLauncher_PortNotANumber() {
        return holder.format("SSHLauncher.PortNotANumber");
    }

    /**
     * Key {@code SSHLauncher.PortNotANumber}: {@code Cannot parse the port}.
     * 
     * @return
     *     {@code Cannot parse the port}
     */
    public static Localizable _SSHLauncher_PortNotANumber() {
        return new Localizable(holder, "SSHLauncher.PortNotANumber");
    }

    /**
     * Key {@code SSHLauncher.UnknownJavaVersion}: {@code Couldn''t figure
     * out the Java version of {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Couldn''t figure out the Java version of {0}}
     */
    public static String SSHLauncher_UnknownJavaVersion(Object arg0) {
        return holder.format("SSHLauncher.UnknownJavaVersion", arg0);
    }

    /**
     * Key {@code SSHLauncher.UnknownJavaVersion}: {@code Couldn''t figure
     * out the Java version of {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Couldn''t figure out the Java version of {0}}
     */
    public static Localizable _SSHLauncher_UnknownJavaVersion(Object arg0) {
        return new Localizable(holder, "SSHLauncher.UnknownJavaVersion", arg0);
    }

    /**
     * Key {@code
     * MissingVerificationStrategyAdministrativeMonitor.DisplayName}: {@code
     * Missing Verification Strategy Monitor}.
     * 
     * @return
     *     {@code Missing Verification Strategy Monitor}
     */
    public static String MissingVerificationStrategyAdministrativeMonitor_DisplayName() {
        return holder.format("MissingVerificationStrategyAdministrativeMonitor.DisplayName");
    }

    /**
     * Key {@code
     * MissingVerificationStrategyAdministrativeMonitor.DisplayName}: {@code
     * Missing Verification Strategy Monitor}.
     * 
     * @return
     *     {@code Missing Verification Strategy Monitor}
     */
    public static Localizable _MissingVerificationStrategyAdministrativeMonitor_DisplayName() {
        return new Localizable(holder, "MissingVerificationStrategyAdministrativeMonitor.DisplayName");
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.ChangedKeyNotTrusted}: {@code
     * {0} [SSH] The SSH key presented by the remote host does not match the
     * key saved in the Known Hosts file against this host. Connections to
     * this host will be denied until the two keys match.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] The SSH key presented by the remote host does not
     *     match the key saved in the Known Hosts file against this host.
     *     Connections to this host will be denied until the two keys match.}
     */
    public static String KnownHostsFileHostKeyVerifier_ChangedKeyNotTrusted(Object arg0) {
        return holder.format("KnownHostsFileHostKeyVerifier.ChangedKeyNotTrusted", arg0);
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.ChangedKeyNotTrusted}: {@code
     * {0} [SSH] The SSH key presented by the remote host does not match the
     * key saved in the Known Hosts file against this host. Connections to
     * this host will be denied until the two keys match.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] The SSH key presented by the remote host does not
     *     match the key saved in the Known Hosts file against this host.
     *     Connections to this host will be denied until the two keys match.}
     */
    public static Localizable _KnownHostsFileHostKeyVerifier_ChangedKeyNotTrusted(Object arg0) {
        return new Localizable(holder, "KnownHostsFileHostKeyVerifier.ChangedKeyNotTrusted", arg0);
    }

    /**
     * Key {@code SSHLauncher.RemoteUserEnvironment}: {@code {0} [SSH] The
     * remote user''s environment is:}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] The remote user''s environment is:}
     */
    public static String SSHLauncher_RemoteUserEnvironment(Object arg0) {
        return holder.format("SSHLauncher.RemoteUserEnvironment", arg0);
    }

    /**
     * Key {@code SSHLauncher.RemoteUserEnvironment}: {@code {0} [SSH] The
     * remote user''s environment is:}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] The remote user''s environment is:}
     */
    public static Localizable _SSHLauncher_RemoteUserEnvironment(Object arg0) {
        return new Localizable(holder, "SSHLauncher.RemoteUserEnvironment", arg0);
    }

    /**
     * Key {@code SSHLauncher.NoJavaFound}: {@code Java version {0} was found
     * but 1.7 or later is needed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Java version {0} was found but 1.7 or later is needed.}
     */
    public static String SSHLauncher_NoJavaFound(Object arg0) {
        return holder.format("SSHLauncher.NoJavaFound", arg0);
    }

    /**
     * Key {@code SSHLauncher.NoJavaFound}: {@code Java version {0} was found
     * but 1.7 or later is needed.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Java version {0} was found but 1.7 or later is needed.}
     */
    public static Localizable _SSHLauncher_NoJavaFound(Object arg0) {
        return new Localizable(holder, "SSHLauncher.NoJavaFound", arg0);
    }

    /**
     * Key {@code SSHLauncher.NoJavaFound2}: {@code Java version {0} was
     * found but 1.{1} or later is needed.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Java version {0} was found but 1.{1} or later is needed.}
     */
    public static String SSHLauncher_NoJavaFound2(Object arg0, Object arg1) {
        return holder.format("SSHLauncher.NoJavaFound2", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.NoJavaFound2}: {@code Java version {0} was
     * found but 1.{1} or later is needed.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Java version {0} was found but 1.{1} or later is needed.}
     */
    public static Localizable _SSHLauncher_NoJavaFound2(Object arg0, Object arg1) {
        return new Localizable(holder, "SSHLauncher.NoJavaFound2", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.JavaVersionResult}: {@code {0} [SSH] {1}
     * -version returned {2}.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] {1} -version returned {2}.}
     */
    public static String SSHLauncher_JavaVersionResult(Object arg0, Object arg1, Object arg2) {
        return holder.format("SSHLauncher.JavaVersionResult", arg0, arg1, arg2);
    }

    /**
     * Key {@code SSHLauncher.JavaVersionResult}: {@code {0} [SSH] {1}
     * -version returned {2}.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] {1} -version returned {2}.}
     */
    public static Localizable _SSHLauncher_JavaVersionResult(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "SSHLauncher.JavaVersionResult", arg0, arg1, arg2);
    }

    /**
     * Key {@code SSHConnector.LaunchTimeoutMustBePositive}: {@code The
     * launch timeout must be a positive number.}.
     * 
     * @return
     *     {@code The launch timeout must be a positive number.}
     */
    public static String SSHConnector_LaunchTimeoutMustBePositive() {
        return holder.format("SSHConnector.LaunchTimeoutMustBePositive");
    }

    /**
     * Key {@code SSHConnector.LaunchTimeoutMustBePositive}: {@code The
     * launch timeout must be a positive number.}.
     * 
     * @return
     *     {@code The launch timeout must be a positive number.}
     */
    public static Localizable _SSHConnector_LaunchTimeoutMustBePositive() {
        return new Localizable(holder, "SSHConnector.LaunchTimeoutMustBePositive");
    }

    /**
     * Key {@code NonVerifyingHostKeyVerifier.NoVerificationWarning}: {@code
     * {0} [SSH] WARNING: SSH Host Keys are not being verified.
     * Man-in-the-middle attacks may be possible against this connection.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] WARNING: SSH Host Keys are not being verified.
     *     Man-in-the-middle attacks may be possible against this connection.}
     */
    public static String NonVerifyingHostKeyVerifier_NoVerificationWarning(Object arg0) {
        return holder.format("NonVerifyingHostKeyVerifier.NoVerificationWarning", arg0);
    }

    /**
     * Key {@code NonVerifyingHostKeyVerifier.NoVerificationWarning}: {@code
     * {0} [SSH] WARNING: SSH Host Keys are not being verified.
     * Man-in-the-middle attacks may be possible against this connection.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] WARNING: SSH Host Keys are not being verified.
     *     Man-in-the-middle attacks may be possible against this connection.}
     */
    public static Localizable _NonVerifyingHostKeyVerifier_NoVerificationWarning(Object arg0) {
        return new Localizable(holder, "NonVerifyingHostKeyVerifier.NoVerificationWarning", arg0);
    }

    /**
     * Key {@code SSHLauncher.CopyingAgentJar}: {@code {0} [SSH] Copying
     * latest remoting.jar...}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Copying latest remoting.jar...}
     */
    public static String SSHLauncher_CopyingAgentJar(Object arg0) {
        return holder.format("SSHLauncher.CopyingAgentJar", arg0);
    }

    /**
     * Key {@code SSHLauncher.CopyingAgentJar}: {@code {0} [SSH] Copying
     * latest remoting.jar...}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Copying latest remoting.jar...}
     */
    public static Localizable _SSHLauncher_CopyingAgentJar(Object arg0) {
        return new Localizable(holder, "SSHLauncher.CopyingAgentJar", arg0);
    }

    /**
     * Key {@code SSHLauncher.LaunchFailed}: {@code {0} SSH Launch of {1} on
     * {2} failed}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} SSH Launch of {1} on {2} failed}
     */
    public static String SSHLauncher_LaunchFailed(Object arg0, Object arg1, Object arg2) {
        return holder.format("SSHLauncher.LaunchFailed", arg0, arg1, arg2);
    }

    /**
     * Key {@code SSHLauncher.LaunchFailed}: {@code {0} SSH Launch of {1} on
     * {2} failed}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} SSH Launch of {1} on {2} failed}
     */
    public static Localizable _SSHLauncher_LaunchFailed(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "SSHLauncher.LaunchFailed", arg0, arg1, arg2);
    }

    /**
     * Key {@code SSHLauncher.StartingAgentProcess}: {@code {0} [SSH]
     * Starting agent process: {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Starting agent process: {1}}
     */
    public static String SSHLauncher_StartingAgentProcess(Object arg0, Object arg1) {
        return holder.format("SSHLauncher.StartingAgentProcess", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.StartingAgentProcess}: {@code {0} [SSH]
     * Starting agent process: {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Starting agent process: {1}}
     */
    public static Localizable _SSHLauncher_StartingAgentProcess(Object arg0, Object arg1) {
        return new Localizable(holder, "SSHLauncher.StartingAgentProcess", arg0, arg1);
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.KeyNotTrusted}: {@code {0}
     * [SSH] WARNING: The SSH key for this host does not match the key
     * required in the connection configuration. Connections will be denied
     * until the host key matches the configuration key.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] WARNING: The SSH key for this host does not match the
     *     key required in the connection configuration. Connections will be
     *     denied until the host key matches the configuration key.}
     */
    public static String ManualKeyProvidedHostKeyVerifier_KeyNotTrusted(Object arg0) {
        return holder.format("ManualKeyProvidedHostKeyVerifier.KeyNotTrusted", arg0);
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.KeyNotTrusted}: {@code {0}
     * [SSH] WARNING: The SSH key for this host does not match the key
     * required in the connection configuration. Connections will be denied
     * until the host key matches the configuration key.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] WARNING: The SSH key for this host does not match the
     *     key required in the connection configuration. Connections will be
     *     denied until the host key matches the configuration key.}
     */
    public static Localizable _ManualKeyProvidedHostKeyVerifier_KeyNotTrusted(Object arg0) {
        return new Localizable(holder, "ManualKeyProvidedHostKeyVerifier.KeyNotTrusted", arg0);
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.TwoPartKey}: {@code Key
     * should be 2 parts: algorithm and Base 64 encoded key value.}.
     * 
     * @return
     *     {@code Key should be 2 parts: algorithm and Base 64 encoded key
     *     value.}
     */
    public static String ManualKeyProvidedHostKeyVerifier_TwoPartKey() {
        return holder.format("ManualKeyProvidedHostKeyVerifier.TwoPartKey");
    }

    /**
     * Key {@code ManualKeyProvidedHostKeyVerifier.TwoPartKey}: {@code Key
     * should be 2 parts: algorithm and Base 64 encoded key value.}.
     * 
     * @return
     *     {@code Key should be 2 parts: algorithm and Base 64 encoded key
     *     value.}
     */
    public static Localizable _ManualKeyProvidedHostKeyVerifier_TwoPartKey() {
        return new Localizable(holder, "ManualKeyProvidedHostKeyVerifier.TwoPartKey");
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.DisplayName}: {@code Known
     * hosts file Verification Strategy}.
     * 
     * @return
     *     {@code Known hosts file Verification Strategy}
     */
    public static String KnownHostsFileHostKeyVerifier_DisplayName() {
        return holder.format("KnownHostsFileHostKeyVerifier.DisplayName");
    }

    /**
     * Key {@code KnownHostsFileHostKeyVerifier.DisplayName}: {@code Known
     * hosts file Verification Strategy}.
     * 
     * @return
     *     {@code Known hosts file Verification Strategy}
     */
    public static Localizable _KnownHostsFileHostKeyVerifier_DisplayName() {
        return new Localizable(holder, "KnownHostsFileHostKeyVerifier.DisplayName");
    }

    /**
     * Key {@code SSHLauncher.FailedToDetectEnvironment}: {@code Failed to
     * detect the environment for automatic JDK installation. Please report
     * this to jenkinsci-users@googlegroups.com: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to detect the environment for automatic JDK
     *     installation. Please report this to jenkinsci-users@googlegroups.com:
     *     {0}}
     */
    public static String SSHLauncher_FailedToDetectEnvironment(Object arg0) {
        return holder.format("SSHLauncher.FailedToDetectEnvironment", arg0);
    }

    /**
     * Key {@code SSHLauncher.FailedToDetectEnvironment}: {@code Failed to
     * detect the environment for automatic JDK installation. Please report
     * this to jenkinsci-users@googlegroups.com: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to detect the environment for automatic JDK
     *     installation. Please report this to jenkinsci-users@googlegroups.com:
     *     {0}}
     */
    public static Localizable _SSHLauncher_FailedToDetectEnvironment(Object arg0) {
        return new Localizable(holder, "SSHLauncher.FailedToDetectEnvironment", arg0);
    }

    /**
     * Key {@code SSHLauncher.CheckingDefaultJava}: {@code {0} [SSH] Checking
     * java version of {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Checking java version of {1}}
     */
    public static String SSHLauncher_CheckingDefaultJava(Object arg0, Object arg1) {
        return holder.format("SSHLauncher.CheckingDefaultJava", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.CheckingDefaultJava}: {@code {0} [SSH] Checking
     * java version of {1}}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Checking java version of {1}}
     */
    public static Localizable _SSHLauncher_CheckingDefaultJava(Object arg0, Object arg1) {
        return new Localizable(holder, "SSHLauncher.CheckingDefaultJava", arg0, arg1);
    }

    /**
     * Key {@code SSHLauncher.AuthenticatingUserPass}: {@code {0} [SSH]
     * Authenticating as {1}/{2}.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Authenticating as {1}/{2}.}
     */
    public static String SSHLauncher_AuthenticatingUserPass(Object arg0, Object arg1, Object arg2) {
        return holder.format("SSHLauncher.AuthenticatingUserPass", arg0, arg1, arg2);
    }

    /**
     * Key {@code SSHLauncher.AuthenticatingUserPass}: {@code {0} [SSH]
     * Authenticating as {1}/{2}.}.
     * 
     * @param arg2
     *      3rd format parameter, {@code {2}}, as {@link String#valueOf(Object)}.
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code {0} [SSH] Authenticating as {1}/{2}.}
     */
    public static Localizable _SSHLauncher_AuthenticatingUserPass(Object arg0, Object arg1, Object arg2) {
        return new Localizable(holder, "SSHLauncher.AuthenticatingUserPass", arg0, arg1, arg2);
    }

    /**
     * Key {@code SSHLauncher.UnexpectedError}: {@code Unexpected error in
     * launching a agent. This is probably a bug in Jenkins.}.
     * 
     * @return
     *     {@code Unexpected error in launching a agent. This is probably a bug
     *     in Jenkins.}
     */
    public static String SSHLauncher_UnexpectedError() {
        return holder.format("SSHLauncher.UnexpectedError");
    }

    /**
     * Key {@code SSHLauncher.UnexpectedError}: {@code Unexpected error in
     * launching a agent. This is probably a bug in Jenkins.}.
     * 
     * @return
     *     {@code Unexpected error in launching a agent. This is probably a bug
     *     in Jenkins.}
     */
    public static Localizable _SSHLauncher_UnexpectedError() {
        return new Localizable(holder, "SSHLauncher.UnexpectedError");
    }

}
