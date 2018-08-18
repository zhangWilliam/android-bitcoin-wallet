//package de.schildbach.wallet.util;
//
//import android.os.Build.VERSION;
//import android.os.Environment;
//import com.google.common.io.BaseEncoding;
//import java.io.File;
//import org.bitcoinj.core.Context;
//import org.bitcoinj.core.NetworkParameters;
//import org.bitcoinj.params.MainNetParams;
//import org.bitcoinj.params.TestNet3Params;
//import org.bitcoinj.utils.MonetaryFormat;
//
//public final class Constants
//{
//    public static final String BITEASY_API_URL;
//    public static final boolean BUG_OPENSSL_HEARTBLEED;
//    public static final Context CONTEXT;
//    public static final String DONATION_ADDRESS;
//    public static final BaseEncoding HEX;
//    public static final MonetaryFormat LOCAL_FORMAT;
//    public static final NetworkParameters NETWORK_PARAMETERS;
//    public static final String PREFIX_ALMOST_EQUAL_TO;
//    public static final boolean TEST = R.class.getPackage().getName().contains("_test1");
//    public static final String WALLET_NAME_CURRENCY_CODE;
//
//    static
//    {
//        Object localObject;
//        if (TEST)
//        {
//            localObject = TestNet3Params.get();
//            NETWORK_PARAMETERS = (NetworkParameters)localObject;
//            CONTEXT = new Context(NETWORK_PARAMETERS);
//            if (!NETWORK_PARAMETERS.getId().equals("org.bitcoin.production")) {
//                break label196;
//            }
//            localObject = "https://api.biteasy.com/v2/btc/mainnet/";
//            label60:
//            BITEASY_API_URL = (String)localObject;
//            if (!NETWORK_PARAMETERS.getId().equals("org.bitcoin.production")) {
//                break label202;
//            }
//            localObject = "btc";
//            label81:
//            WALLET_NAME_CURRENCY_CODE = (String)localObject;
//            if (NETWORK_PARAMETERS.getId().equals("org.bitcoin.production")) {}
//            DONATION_ADDRESS = null;
//            PREFIX_ALMOST_EQUAL_TO = Character.toString('���') + '���';
//            LOCAL_FORMAT = new MonetaryFormat().noCode().minDecimals(2).optionalDecimals(new int[0]);
//            HEX = BaseEncoding.base16().lowerCase();
//            if ((Build.VERSION.SDK_INT != 16) || (!Build.VERSION.RELEASE.startsWith("4.1.1"))) {
//                break label208;
//            }
//        }
//        label196:
//        label202:
//        label208:
//        for (boolean bool = true;; bool = false)
//        {
//            BUG_OPENSSL_HEARTBLEED = bool;
//            return;
//            localObject = MainNetParams.get();
//            break;
//            localObject = "https://api.biteasy.com/v2/btc/testnet/";
//            break label60;
//            localObject = "tbtc";
//            break label81;
//        }
//    }
//
//    public static final class Files
//    {
//        public static final String BLOCKCHAIN_FILENAME;
//        public static final String CHECKPOINTS_FILENAME;
//        public static final File EXTERNAL_STORAGE_DIR;
//        public static final String EXTERNAL_WALLET_BACKUP;
//        public static final File EXTERNAL_WALLET_BACKUP_DIR;
//        public static final String EXTERNAL_WALLET_KEY_BACKUP;
//        private static final String FILENAME_NETWORK_SUFFIX;
//        public static final String WALLET_FILENAME_PROTOBUF;
//        public static final String WALLET_KEY_BACKUP_BASE58;
//        public static final String WALLET_KEY_BACKUP_PROTOBUF;
//
//        static
//        {
//            if (Constants.NETWORK_PARAMETERS.getId().equals("org.bitcoin.production")) {}
//            for (String str = "yxt";; str = "-testnet")
//            {
//                FILENAME_NETWORK_SUFFIX = str;
//                WALLET_FILENAME_PROTOBUF = "wallet-protobuf" + FILENAME_NETWORK_SUFFIX;
//                WALLET_KEY_BACKUP_BASE58 = "key-backup-base58" + FILENAME_NETWORK_SUFFIX;
//                WALLET_KEY_BACKUP_PROTOBUF = "key-backup-protobuf" + FILENAME_NETWORK_SUFFIX;
//                EXTERNAL_STORAGE_DIR = Environment.getExternalStorageDirectory();
//                EXTERNAL_WALLET_BACKUP_DIR = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
//                EXTERNAL_WALLET_KEY_BACKUP = "yxt-wallet-keys" + FILENAME_NETWORK_SUFFIX;
//                EXTERNAL_WALLET_BACKUP = "yxt-wallet-backup" + FILENAME_NETWORK_SUFFIX;
//                BLOCKCHAIN_FILENAME = "blockchain" + FILENAME_NETWORK_SUFFIX;
//                CHECKPOINTS_FILENAME = "checkpoints" + FILENAME_NETWORK_SUFFIX + ".txt";
//                return;
//            }
//        }
//    }
//}
