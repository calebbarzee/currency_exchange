//class currencyExchange {
//    OkHttpClient client = new OkHttpClient();
//
//}
//
//    public static void main()
//
//    public void whenAsynchronousGetRequest_thenCorrect() {
//        Request request = new Request.Builder()
//                .url("https://api.currencystack.io/currency?base=USD&target=EUR,GBP&apikey=API_KEY" + "/date")
//                .get()
//                .build();
//
//        Call call = client.newCall(request);
//        call.enqueue(new Callback() {
//            public void onResponse(Call call, Response response)
//                    throws IOException {
//                // ...
//            }
//
//            public void onFailure(Call call, IOException e) {
//                fail();
//                System.out.println("API Call Failed");
//            }
//        });
//    }


// currency.io documentation for api call through OkHttpClient
// OkHttpClient client = new OkHttpClient();
//         Request request = new Request.Builder()
//                 .url("https://api.currencystack.io/currency?base=USD&target=EUR,GBP&apikey=API_KEY")
//                 .get()
//                 .build();

//         Response response = client.newCall(request).execute();

// asynch get
// @Test
// public void whenAsynchronousGetRequest_thenCorrect() {
//     Request request = new Request.Builder()
//     .url(BASE_URL + "/date")
//     .build();

//     Call call = client.newCall(request);
//     call.enqueue(new Callback() {
//         public void onResponse(Call call, Response response)
//         throws IOException {
//             // ...
//         }

//         public void onFailure(Call call, IOException e) {
//             fail();
//         }
//     });
// }

// add a header to a request
// @Test
// public void whenSetHeader_thenCorrect() throws IOException {
//     Request request = new Request.Builder()
//     .url(SAMPLE_URL)
//     .addHeader("Content-Type", "application/json")
//     .build();

//     Call call = client.newCall(request);
//     Response response = call.execute();
//     response.close();