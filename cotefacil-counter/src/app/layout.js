import "./globals.css";

export const metadata = {
  title: "Cotefacil - Counter",
  description: "Created by Marcelo Coldibelli",
};

export default function RootLayout({ children }) {
  return (
    <html lang="en">
      <head>
        <link rel="icon" href="favicon.png" />
      </head>
      <body>
        {children}
      </body>
    </html>
  );
}
